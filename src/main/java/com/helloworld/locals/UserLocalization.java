package com.helloworld.locals;

import org.apache.log4j.Logger;

import java.util.Locale;

public class UserLocalization {

    private static final Logger LOG = Logger.getLogger(UserLocalization.class);

    public static Locale getCurrentUserLocale() {

        LOG.info("getting current user location");
        
        return Locale.getDefault();
    }
}