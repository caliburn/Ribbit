package com.allentbrown.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by abrown54 on 8/17/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "7g2Fz6GQLtcAyaSzxGeXhsHbbRDKf82p9ui4MBID", "Qbuq4C1ZlvTpgkgn750Nb0l8mlF2yOpUO050jKAQ");

    }
}
