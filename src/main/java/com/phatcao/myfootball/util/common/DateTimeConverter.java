package com.phatcao.myfootball.util.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConverter {

    public static Date stringToDateTime (String dateTime) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateTime);
            return date;
        }
        catch ( Exception e){
            return null;
        }
    }
}
