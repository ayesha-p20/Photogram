package com.example.photogram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

         //initializing the SDK
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ayesha-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("MyIgApp")  // set explicitly unless clientKey is explicitly configured on Parse server
                //.clientBuilder(builder)
                .server("http://ayesha-instagram-codepath.herokuapp.com/parse").build());
    }
}
