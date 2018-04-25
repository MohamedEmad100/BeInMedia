package com.m.emad.beinmedia.view.custom.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseDialog;

import butterknife.BindView;

/**
 * Craeted by M.Emad
 */
public class ErrorDialog extends BaseDialog {

    @BindView(R.id.error_title)
    TextView txtTitle;

    @BindView(R.id.error_message)
    TextView txtMessage;


    @BindView(R.id.btn_secondary)
    Button btnSecondary;

    String mstrTitle;
    String mstrMessage;
    String mstrPrimaryButton;
    String mstrSecondaryButton;
    View.OnClickListener primaryButtonListener;
    View.OnClickListener secondaryButtonListener;

    public static ErrorDialog getInstance(String title , String message) {
        return new ErrorDialog().setTitle(title).setMessage(message);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtTitle.setText(mstrTitle);
        txtMessage.setText(mstrMessage);

        if (secondaryButtonListener != null){
            btnSecondary.setOnClickListener(secondaryButtonListener);
            btnSecondary.setText(mstrSecondaryButton);
            btnSecondary.setVisibility(View.VISIBLE);
        }
    }


    public ErrorDialog setTitle(String title) {
        this.mstrTitle = title;
        return this;
    }

    public ErrorDialog setMessage(String message) {
        this.mstrMessage = message;
        return this;
    }

    public ErrorDialog setPrimaryButton(String buttonText ,View.OnClickListener primaryButtonListener) {
        this.primaryButtonListener = primaryButtonListener;
        this.mstrPrimaryButton = buttonText;
        return this;
    }

    public ErrorDialog setSecondaryButton(String buttonText ,View.OnClickListener secondaryButtonListener) {
        this.secondaryButtonListener = secondaryButtonListener;
        this.mstrSecondaryButton = buttonText;
        return this;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.dialog_error;
    }

}
