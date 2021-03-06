package com.callhippo.bueno.callhippo.Utils;

import android.app.Activity;
import 	androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import 	androidx.appcompat.widget.Toolbar;
import android.view.View;

public class SmoothActionBarDrawerToggle extends ActionBarDrawerToggle {

    private Runnable runnable;

    public SmoothActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int openDrawerContentDescRes, int closeDrawerContentDescRes) {
        super(activity, drawerLayout, toolbar, openDrawerContentDescRes, closeDrawerContentDescRes);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        super.onDrawerOpened(drawerView);

    }
    @Override
    public void onDrawerClosed(View view) {
        super.onDrawerClosed(view);

    }
    @Override
    public void onDrawerStateChanged(int newState) {
        super.onDrawerStateChanged(newState);
        if (runnable != null && newState == DrawerLayout.STATE_IDLE) {
            runnable.run();
            runnable = null;
        }
    }

    public void runWhenIdle(Runnable runnable) {
        this.runnable = runnable;
    }
}