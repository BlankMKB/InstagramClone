package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("524mW39e8Y1jeHNRKMeddG6CoOfdGPZ2z673Pv3t")
                .clientKey("UtY7nAmeZjkSb5lnfN38ehu2PFXgwm4FNKfyfvko")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
