package com.helloworld.currenttime;

import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

    private static final Logger LOG = Logger.getLogger(CurrentTime.class);

    public static int currentTime(Date date) {

        DateFormat dateFormat = new SimpleDateFormat("HH");

        int hours = Integer.parseInt(dateFormat.format(date));

        LOG.info("current time: "+ hours);

        return hours;
    }
}
