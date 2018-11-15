package com.helloworld.init;

import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleInit {

    private static final Logger LOG = Logger.getLogger(LocaleInit.class);

    public static ResourceBundle getCurrentLocalMessages(Locale locale){

       LOG.info(String.format("definition language is ", locale));
        return ResourceBundle.getBundle("messages", locale);
    }
}
