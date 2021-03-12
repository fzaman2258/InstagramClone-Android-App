package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MffU07bVHcQanUzJCoXhLrRmsruWBtx5wegZlj3p") // should correspond to Application Id env variable
                .clientKey("JrLnFTTd27rTCROxF8q8IdiZcYdXwuVAA8hU40Oo")  // should correspond to Client key env variable
                .server("https://parseapi.back4app.com").build());
    }
}
