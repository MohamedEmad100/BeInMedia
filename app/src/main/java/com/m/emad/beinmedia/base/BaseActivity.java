package com.m.emad.beinmedia.base;

import android.support.v4.app.Fragment;

import com.m.emad.beinmedia.R;
import com.m.emad.beinmedia.view.utils.FragmentUtil;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by M.Emad
 */
public class BaseActivity extends DaggerAppCompatActivity {

    @Override
    public void onBackPressed() {
        Fragment currentFragment = FragmentUtil.getCurrentFragment(getSupportFragmentManager(), R.id.mainFragmentContainer);
        if( currentFragment != null && currentFragment instanceof BaseOnBack){
            if(((BaseOnBack) currentFragment).onBackPressed()){
                return;
            }
        }

        super.onBackPressed();
    }


    public void pushFragment(Fragment fragment){}
    public void addFragment(Fragment fragment){}
}
