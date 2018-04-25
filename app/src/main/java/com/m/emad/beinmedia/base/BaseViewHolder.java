package com.m.emad.beinmedia.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by M.Emad
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    protected T mBusinessObject ;

    public void bindData(T businessObject , int position) {
        this.mBusinessObject = businessObject ;
        this.bindViewData(businessObject , position);
    }

    public abstract void bindViewData(T businessObject , int position);
    public BaseViewHolder(View itemView) {
        super(itemView);
    }
}
