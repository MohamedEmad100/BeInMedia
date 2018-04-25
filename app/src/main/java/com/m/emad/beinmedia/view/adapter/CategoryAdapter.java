package com.m.emad.beinmedia.view.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseViewHolder;
import com.m.emad.beinmedia.data.model.Category;
import com.m.emad.beinmedia.data.model.Locale;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by M.Emad
 */

public class CategoryAdapter extends PaginationAdapter<Category> {

    private OnCategoryClickListener mListener;
    private String url = "https://oktabletmenu.com/api/v1/category/";

    public CategoryAdapter(Context objView, List<Category> categories, OnCategoryClickListener listener) {
        super(objView);
        setDataList(categories);
        mListener = listener;
    }

    public interface OnCategoryClickListener {
        void onCategoryClicked(Category category);
    }

    @Override
    protected BaseViewHolder getHolderInstance(View view) {
        return new CategoryViewHolder(view);
    }

    @Override
    protected BaseViewHolder getLoadingInstance(View view) {
        return new BaseViewHolder(view) {
            @Override
            public void bindViewData(Object businessObject, int position) {

            }
        };
    }

    @Override
    protected int getLoadingResourceId() {
        return R.layout.row_progress;
    }

    @Override
    protected int getHolderResourceId() {
        return R.layout.item_home_category;
    }

    class CategoryViewHolder extends BaseViewHolder<Category> {
        @BindView(R.id.imv_category)
        ImageView imvCategory;
        @BindView(R.id.txt_category)
        TextView txtCategory;


        public CategoryViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this ,itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        mListener.onCategoryClicked(mBusinessObject);
                    }
                }
            });
        }

        @Override
        public void bindViewData(Category businessObject, int position) {
            String CategoryImage = businessObject.getCategoryImage();
            List<Locale> locales = businessObject.getNamesLocalized();
            String CategoryName = locales.get(0).getContent();
            Picasso.with(mContext).load(url+CategoryImage).fit().into(imvCategory);
            txtCategory.setText(CategoryName);

        }
    }

}
