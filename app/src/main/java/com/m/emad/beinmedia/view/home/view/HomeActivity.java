package com.m.emad.beinmedia.view.home.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.m.emad.beinmedia.MainActivity;
import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.base.BaseActivity;
import com.m.emad.beinmedia.view.utils.FragmentUtil;

/**
 * Created by M.Emad
 */
public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            postponeEnterTransition();
        }
        setContentView(R.layout.home_activity);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.mainFragmentContainer);
        if (fragment == null) {
            FragmentUtil.replaceFragment(
                    getSupportFragmentManager(), R.id.mainFragmentContainer, HomeFragment.newInstance(), null, false);
        }
    }

    @Override
    public void pushFragment(Fragment fragment) {
        FragmentUtil.replaceFragment(getSupportFragmentManager(), R.id.mainFragmentContainer, fragment);
    }

    public void navigateToHome(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}