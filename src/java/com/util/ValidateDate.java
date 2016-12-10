/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class ValidateDate {

    public static boolean checkStartDate(String startDate, String endDate) {
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        long sum;
        try {

            Date sDate = newFormat.parse(startDate);
            Date eDate = newFormat.parse(endDate);
            long iStartDate = (int) sDate.getTime();
            long iEndDate = (int) eDate.getTime();
            sum = (iStartDate - iEndDate) / 86400000;
            System.out.println(sum);
            if (sum < 0) {
                return false;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return true;
    }

    public static int calculateDayByDate(String startDate, String endDate) throws ParseException {
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);

        Date date = sdf.parse(startDate);
        cal1.setTime(date);
        date = sdf.parse(endDate);
        cal2.setTime(date);
        int sum = daysBetween(cal1.getTime(), cal2.getTime());
        return sum +1;
    }
    public static int calculateDayByDateIfCurrentDate(String checkDate) throws ParseException {
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();
        Date today = Calendar.getInstance().getTime();        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        String currentDate = sdf.format(today);
        Date date = sdf.parse(currentDate);
        cal1.setTime(date);
        date = sdf.parse(checkDate);
        cal2.setTime(date);
        int sum = daysBetween(cal1.getTime(), cal2.getTime());
        return sum;
    }

    public static int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(calculateDayByDateIfCurrentDate("2015-03-12"));
    }
}
