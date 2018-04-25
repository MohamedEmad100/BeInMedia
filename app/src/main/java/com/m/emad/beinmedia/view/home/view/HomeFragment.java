package com.m.emad.beinmedia.view.home.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseFragment;
import com.m.emad.beinmedia.data.model.Category;
import com.m.emad.beinmedia.view.adapter.CategoryAdapter;
import com.m.emad.beinmedia.view.home.HomeContract;
import com.m.emad.beinmedia.view.profile.view.ProfileFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by M.Emad
 */
public class HomeFragment extends BaseFragment<HomeContract.Presenter> implements HomeContract.View,CategoryAdapter.OnCategoryClickListener{

    @BindView(R.id.imv_profile)
    ImageView toolbar;

    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeRefreshLayout;

    @BindView(R.id.recycler_category)
    RecyclerView recyclerVouchers;

    CategoryAdapter categoryAdapter;

    @Inject
    HomeContract.Presenter mHomePresenter;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHomePresenter.attachView(this);
        setPresenter(mHomePresenter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        categoryAdapter = new CategoryAdapter(mContext, new ArrayList<Category>(), this);
        GridLayoutManager layoutManager = new GridLayoutManager(mContext, 2);
        recyclerVouchers.setLayoutManager(layoutManager);
        recyclerVouchers.setAdapter(categoryAdapter);

        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                switch(categoryAdapter.getItemViewType(position)){
                    case CategoryAdapter.VIEW_TYPE_LOADING:
                        return 1;
                    case CategoryAdapter.VIEW_TYPE_ACTIVITY:
                        return 2;
                    default:
                        return -1;
                }
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                mHomePresenter.initialize();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
        mHomePresenter.initialize();

    }

    @Override
    public void onCategoryClicked(Category category) {
        //((HomeActivity)getActivity()).addFragment(VoucherDetailFragment.newInstance(categoryAdapter.getDataList()));
    }

    @OnClick(R.id.imv_profile)
    void OnProfileClick(){
        ProfileFragment profileFragment = ProfileFragment.newInstance();
        ((HomeActivity)getActivity()).pushFragment(profileFragment);
    }


    @Override
    public void showCategories(List<Category> categoryList) {
        if (!categoryList.isEmpty()) {
            showContent();
            categoryAdapter.setDataList(categoryList);
        } else {
            categoryAdapter.setDataList(new ArrayList<Category>());
        }
    }




    @Override
    public void showNetworkError() {
        showSnackbarView(getView() , getString(R.string.connection_error_message) , SnackViewType.error);
    }


    @Override
    public void showError(String errorMessage) {
        showSnackbarView(getView() , errorMessage , SnackViewType.error);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    public void navigateToHome() {

    }

    @Override
    public void showLoading() { }

    @Override
    public void showContent() { }
}
