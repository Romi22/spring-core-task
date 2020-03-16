package com.luv2code.springdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatter {
   static String data;
    public  Date parse(String data) throws ParseException
    {

        String[] value=data.split("\\|");
        String date=value[0];
        String format=value[1];
        System.out.println(date);
        System.out.println(format);
        Date date1=new SimpleDateFormat(format).parse(date);
        System.out.println(date1);
        return date1;
    }

}  