package com.example.commonutils.utils.dateConverter;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static com.example.commonutils.utils.constants.CommonConstant.DateConstant.*;

public class DateConverter {

    public static LocalDate toLocalDate(Long millis) {
        return Instant.ofEpochMilli(millis)
                .atOffset(ZoneOffset.UTC)
                .toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Long millis){
        return Instant.ofEpochMilli(millis)
                .atOffset(ZoneOffset.UTC)
                .toLocalDateTime();
    }

    public static Long localDateTimeToMillis(LocalDateTime localDateTime){
        return localDateTime.atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

    public static Instant millisToInstant(Long millis){
        return Instant.ofEpochMilli(millis)
                .atOffset(ZoneOffset.UTC)
                .toInstant();
    }

    public static String localDateToStringFormat1(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern(MONTH_DAY_YEAR_SLASH));
    }

    public static String localDateToStringFormat2(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern(DAY_MONTH_YEAR_SLASH));
    }

    public static String localDateToStringFormat3(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern(STANDARD_FORMAT));
    }

    public static String localDateTimeToStringFormat1(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern(DAY_MONTH_YEAR_SLASH_TIME));
    }

    public static String localDateTimeToStringFormat2(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern(DAY_MONTH_YEAR_SLASH_TIME_SEC));
    }

    public static String localDateTimeToStringFormat3(LocalDateTime localDateTime){
        return localDateTime.format(DateTimeFormatter.ofPattern(STANDARD_TIME_SEC));
    }

    public static String localTimeToStringFormat1(LocalTime localTime){
        return localTime.format(DateTimeFormatter.ofPattern(HOUR_MINUTE_SEC_MILLIS));
    }

    public static String localTimeToStringFormat2(LocalTime localTime){
        return localTime.format(DateTimeFormatter.ofPattern(HOUR_MINUTE_SEC));
    }

    public static String localTimeToStringFormat3(LocalTime localTime){
        return localTime.format(DateTimeFormatter.ofPattern(HOUR_MINUTE));
    }
}
