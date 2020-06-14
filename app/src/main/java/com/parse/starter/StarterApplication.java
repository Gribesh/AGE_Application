package com.parse.starter;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
//        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
//                .applicationId("abe1c94b00ba6aa6b8e013b2de77dc5bd9bd5e9b")
//                .clientKey("4a3064172bba51283371645ac21a45e82c588c2a")
//                .server("http://ec2-54-149-166-193.us-west-2.compute.amazonaws.com/parse/")
//                .build()
//        );
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("myappID")
                .clientKey("naJz7qKl78Vs")
                .server("http://52.66.208.22/parse/")
                .build()
        );



        // ParseUser.enableAutomaticUser();

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

    }
}