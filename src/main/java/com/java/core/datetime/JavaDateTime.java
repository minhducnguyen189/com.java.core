package com.java.core.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class JavaDateTime {

    public static void main(String[] args) {
        System.out.println(getLocalDate("04-APR-22"));
        System.out.println(getLocalDateTime("04-APR-22"));
    }

    public static String getLocalDate(String localDateStr) {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("dd-MMM-yy")
                .toFormatter(Locale.US);
        LocalDate localDate = LocalDate.parse(localDateStr, dateTimeFormatter);
        return localDate.toString();
    }

    public static String getLocalDateTime(String localDateStr) {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("dd-MMM-yy")
                .toFormatter(Locale.US);
        LocalDate localDate = LocalDate.parse(localDateStr, dateTimeFormatter);
        return localDate.atStartOfDay().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
