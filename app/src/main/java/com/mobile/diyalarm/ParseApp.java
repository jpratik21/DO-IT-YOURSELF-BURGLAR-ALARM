package com.mobile.diyalarm;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "kYEpZrKeO9v7bFYJEddEgwNT3BuXiFK4C9Xnjt5a", "dPowKFiVM5YCJbk88xNOsjxFH2b5p1lk3eZDTlXn");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }
}
