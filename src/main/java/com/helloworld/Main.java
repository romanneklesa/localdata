package com.helloworld;

import com.helloworld.currenttime.CurrentTime;
import com.helloworld.greeting.Greeting;
import com.helloworld.init.LocaleInit;
import com.helloworld.locals.UserLocalization;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class  Main {

    public static void main(String[] args) {

        Locale current = UserLocalization.getCurrentUserLocale();
        ResourceBundle translate = LocaleInit.getCurrentLocalMessages(current);
        Date date = new Date();
        Greeting greeting = new Greeting();
        System.out.println(greeting.welcomeUserByLocalization(date, translate));
    }

}
