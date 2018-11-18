package com.helloworld;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Some {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String country = "", language = "";

        System.out.println("1 – Английский");

        System.out.println("2 – Белорусский");

        System.out.println("Любой символ – Русский");

        char i = 0;

        try {

            i = (char) System.in.read();

        } catch (IOException e1) {

            e1.printStackTrace();

        }

        switch (i) {

case '1':

            country = "RU";

            language = "RU";

            break;

case '2':

            country = "US";

            language = "EN";

        }

        Locale current = new Locale(country, language);

        ResourceBundle rb =

                ResourceBundle.getBundle("messages", current);

        try {

            String st = rb.getString("day.time");

            String s1 =

                    new String(st.getBytes("ISO-8859-1"), "UTF-8");

            System.out.println(s1);

            st = rb.getString("night.time");

            String s2 =

                    new String(st.getBytes("ISO-8859-1"), "UTF-8");

            System.out.println(s2);

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();

        }

    }

}
