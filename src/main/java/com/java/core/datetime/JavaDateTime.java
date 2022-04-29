package com.java.core.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class JavaDateTime {


    public static void main(String[] args) {
        String localDateStr = "04-APR-22";
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("dd-MMM-yy")
                .toFormatter(Locale.US);
        LocalDate localDate = LocalDate.parse(localDateStr, dateTimeFormatter);
        System.out.printf(localDate.toString());
    }

}
