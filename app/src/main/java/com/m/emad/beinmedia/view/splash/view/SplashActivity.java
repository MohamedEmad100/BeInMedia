package com.m.emad.beinmedia.view.splash.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseActivity;
import com.m.emad.beinmedia.view.home.view.HomeActivity;
import com.m.emad.beinmedia.view.login.view.LoginActivity;
import com.m.emad.beinmedia.view.splash.SplashContract;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class SplashActivity extends BaseActivity implements SplashContract.View{


    UserManager userManager;

    TextView textView;
    @Inject
    SplashContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        textView =(TextView) findViewById(R.id.demotest);
        presenter.attachView(this);
        presenter.isUserLogin();
    }

    @Override
    public void NavigateToHome( String ss) {
        Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();


    }

    @Override
    public void NavigateToLogin() {

        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();

    }
}
