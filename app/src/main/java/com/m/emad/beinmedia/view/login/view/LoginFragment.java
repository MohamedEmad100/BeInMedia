package com.m.emad.beinmedia.view.login.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

import com.dd.CircularProgressButton;
import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseFragment;
import com.m.emad.beinmedia.view.custom.dialog.ErrorDialog;
import com.m.emad.beinmedia.view.login.LoginContract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by M.Emad
 */
public class LoginFragment extends BaseFragment implements LoginContract.View  {

    @BindView(R.id.etxtUserName)
    AppCompatEditText etxtUserName;

    @BindView(R.id.etxtPassword)
    AppCompatEditText etxtPassword;

    @BindView(R.id.btnSignIn)
    CircularProgressButton circularProgressButton;

    private ErrorDialog errorDialog;

    @Inject
    LoginContract.Presenter loginPresenter;

    public static LoginFragment newInstance() {
        Bundle args = new Bundle();
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Inject
    public LoginFragment() {
        // Requires empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPresenter(loginPresenter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void navigateToHome() {
        ((LoginActivity)getActivity()).navigateToHome();
    }

    @OnClick(R.id.btnSignIn)
    void onSiginInClick(){
        loginPresenter.login(etxtUserName.getText().toString(),etxtPassword.getText().toString());
    }

    @Override
    public void showLoading() { circularProgressButton.setProgress(50); }

    @Override
    public void showContent() {
        circularProgressButton.setProgress(0);
    }

    @Override
    public void showNetworkError() {
        errorDialog = ErrorDialog.getInstance(getString(R.string.connection_error_title) , getString(R.string.connection_error_message));
        errorDialog.setPrimaryButton("OK" ,new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorDialog.dismiss();
            }
        });
        errorDialog.show(getFragmentManager() , "Error_Dialog");
    }

    @Override
    public void showLoginError() {
        errorDialog = ErrorDialog.getInstance(getString(R.string.login_error_title) , getString(R.string.login_error_message));

        errorDialog.setSecondaryButton(getString(R.string.retry), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorDialog.dismiss();
                onSiginInClick();
            }
        });
        errorDialog.show(getFragmentManager() , "Error_Dialog");
    }

    @Override
    protected int getLayoutRes() { return R.layout.login_fragment; }
}
