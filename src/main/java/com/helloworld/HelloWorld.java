package com.helloworld;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class HelloWorld {

    private static final Logger LOG = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) throws IOException {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.getData();
        LOG.info("Your time");
    }

    public void getData() {

        LOG.info("Greeting depending on time");
        DateFormat dateFormat = new SimpleDateFormat("HH");

        Date date = new Date();
        int hours = Integer.parseInt(dateFormat.format(date));

        if (hours > 6 && hours < 9) {
            LOG.info("Morning Time");
            System.out.println(toBundle().getString("morning.time"));
        }
        if (hours >= 9 && hours < 19) {
            LOG.info("Day Time");
            System.out.println(toBundle().getString("day.time"));

        }
        if (hours >= 19 && hours < 22) {
            LOG.info("Evening Time");
            System.out.println(toBundle().getString("evening.time"));
        }
        if (hours >= 23 || hours <= 6) {
            LOG.info("Night Time");
            System.out.println(toBundle().getString("night.time"));

        }
    }

    public ResourceBundle toBundle() {

        LOG.info("File retrieval depending on location");
        ResourceBundle bundle = ResourceBundle.getBundle("messages");

        if (Locale.getDefault().getDisplayLanguage().equals("English")) {
            Locale current = new Locale("en", "US");
            bundle = ResourceBundle.getBundle("messages_en_US", current);
        } else if (Locale.getDefault().getDisplayLanguage().equals("Русский")) {
            Locale current = new Locale("ru", "RU");
            bundle = ResourceBundle.getBundle("messages_ru_RU", current);
        }
        return bundle;
    }
}
