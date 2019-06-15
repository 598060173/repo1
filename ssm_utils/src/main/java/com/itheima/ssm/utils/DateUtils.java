package com.itheima.ssm.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date stringToDate(String str,Date date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(str);
        Date parse = dateFormat.parse(str);
        return parse;
    }

    public static String dateToString(Date date,String str){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        String format = simpleDateFormat.format(date);
        return format;
    }

}
