package com.m.emad.beinmedia.view.profile.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseFragment;
import com.m.emad.beinmedia.data.model.UserViewer;
import com.m.emad.beinmedia.view.profile.ProfileContract;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by M.Emad
 */
public class ProfileFragment extends BaseFragment<ProfileContract.Presenter> implements ProfileContract.View{

    @BindView(R.id.imv_back)
    ImageView imvBack;
    @BindView(R.id.vtxtID)
    TextView vtxtID;
    @BindView(R.id.vtxtEmail)
    TextView vtxtEmail;
    @BindView(R.id.vtxtPassword)
    TextView vtxtPass;
    @BindView(R.id.vtxtRefID)
    TextView vtxtRef;
    @BindView(R.id.vtxtPhone)
    TextView vtxtPhone;
    @BindView(R.id.vtxtUserName)
    TextView vtxtName;


    @Inject
    ProfileContract.Presenter mProfilePresenter;

    public static ProfileFragment newInstance() {
        Bundle args = new Bundle();
        ProfileFragment profileFragment = new ProfileFragment();
        profileFragment.setArguments(args);
        return profileFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setBackView(imvBack);
        setPresenter(mProfilePresenter);
        mProfilePresenter.initialize();
    }




    @Override
    protected int getLayoutRes() {return R.layout.fragment_profile;}



    @Override
    public void showProfile(UserViewer userViewer) {
        vtxtName.setText(userViewer.getName());
        vtxtID.setText(userViewer.getId());
        vtxtEmail.setText(userViewer.getEmail());
        vtxtPass.setText(userViewer.getRestaurantName());
        vtxtPhone.setText(userViewer.getPhone());
        vtxtRef.setText(userViewer.getRefId());
    }


    @Override
    public void showError(String errorMessage) {
        showSnackbarView(getView() , errorMessage , SnackViewType.error);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showContent() {

    }
}
