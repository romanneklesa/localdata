package com.helloworld.greeting;

import com.helloworld.currenttime.CurrentTime;
import org.apache.log4j.Logger;
import java.util.Date;
import java.util.ResourceBundle;

public class Greeting {

    private static final Logger LOG = Logger.getLogger(Greeting.class);
    private static final String GOODNIGHT = "night.time";
    private static final String GOODMORNING = "morning.time";
    private static final String GOODDAY = "day.time";
    private static final String GOODEVENING = "evening.time";

    public String welcomeUserByLocalization(Date date, ResourceBundle resourceBundle) {

        int hour = CurrentTime.currentTime(date);

        LOG.info(String.format("Input date is: " + resourceBundle.getLocale()));

        if (hour >= 23 || hour >= 0 && hour <= 5) {
            return resourceBundle.getString(GOODNIGHT);
        } else if (hour >= 6 && hour <= 9) {
            return resourceBundle.getString(GOODMORNING);
        } else if (hour >= 9 && hour <= 18) {
            return resourceBundle.getString(GOODDAY);
        } else if (hour >= 19 && hour <= 22) {
            return resourceBundle.getString(GOODEVENING);
        } else return null;
    }
}

