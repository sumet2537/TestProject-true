package com.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class DateUtil {

    public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
    public static final String DEFAULT_DATETIME_FORMAT = "dd/MM/yyyy HH:mm";
    public static final String DEFAULT_DATETIME_FORMAT2 = "dd/MM/yyyy HH:mm:ss";
    public static final String DEFAULT_DATETIME_FORMAT3 = "yyyy-MM-dd HH:mm:ss";
    public static final String LOAN_DATETIME_FORMAT = "yyyyMMdd HHmmss";
    public static final String LOAN2_DATETIME_FORMAT = "yyyyMMddHHmmss";
    public static final String BATCH_NO_FORMAT = "yyMMddHHmmss";
    public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    public static final String LOAN_TIME_FORMAT = "HHmmss";
    public static final Locale APPLICATION_LOCALE = Locale.US;
    public static final Locale APPLICATION_LOCALE_TH = new Locale("th", "TH");
    public static final String TIME_HHMM_FORMAT = "HH.mm";
    public static final String TIME_HHMM_FORMAT2 = "HH:mm:ss";
    public static final String TIME_HHMM_FORMAT3 = "HHmm";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
    //public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    //public static final String DEFAULT_TIME_PATTERN = "hh:mm:ss a";
    public static final String DEFAULT_TIMEZONE_PATTERN = "GMT+07:00";
    public static final String DEFAULT_DATE_DELIMITER = " ";
    public static final String DEFAULT_TEXT_DATE_FORMAT = "d MMMM yyyy";
    public static final String DATE_FORMAT_DDMMYYYY = "ddMMyyyy";
    public static final String[] ThaiShortDate = new String[]{"ม.ค.","ก.พ.","มี.ค.","เม.ย.","พ.ค.","มิ.ย.","ก.ค.","ส.ค.","ก.ย.","ต.ค.","พ.ย.","ธ.ค."};
    public static final String[] ThaiFullDate = new String[]{"มกราคม","กุมภาพันธ์","มีนาคม","เมษายน","พฤษภาคม","มิถุนายน","กรกฎาคม","สิงหาคม","กันยายน","ตุลาคม","พฤศจิกายน","ธันวาคม"};
    
    public DateUtil() {
    }
    // @TODO to be removed

    public static String getDateFormat(java.sql.Date rcvDate, String format) {
        String dateStr = "";
        try {
            java.util.Date utilDate = new java.util.Date(rcvDate.getTime());
            SimpleDateFormat formatter = new SimpleDateFormat(format, APPLICATION_LOCALE);
            dateStr = formatter.format(utilDate);
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return dateStr;
    }

    public static String getDateFormat(java.util.Date rcvDate, String format) {
        String dateStr = "";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format, APPLICATION_LOCALE);
            dateStr = formatter.format(rcvDate);
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return dateStr;
    }
    
    public static String getDateFormatThai(java.util.Date rcvDate, String format) {
        String dateStr = "";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format, APPLICATION_LOCALE_TH);
            dateStr = formatter.format(rcvDate);
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return dateStr;
    }

    public static java.util.Date parseThai(String dateString, String pattern)
            throws java.text.ParseException {
        java.util.Date dateThai = null;

        if(dateString!=null&&!"".equals(dateString)){
            SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE_TH);
            dateThai = sdf.parse(dateString);
        }
        return dateThai;
    }

    public static java.sql.Date parseThai2SqlDate(String dateString, String pattern)
            throws java.text.ParseException {
        return toSqlDate(parseThai(dateString, pattern));
    }

    public static java.sql.Timestamp parseThai2SqlTimestamp(String dateString, String pattern)
            throws java.text.ParseException {
        return toTimeStamp(parseThai(dateString, pattern));
    }

    public static String getDateFormat(java.sql.Timestamp rcvDate, String format) {
        String dateStr = "";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format, APPLICATION_LOCALE);
            dateStr = formatter.format(rcvDate);
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return dateStr;
    }

    // @TODO to be removed
    public static java.sql.Date getDateFromString(String rcvDate, String format) {
        java.sql.Date sqlDate = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.US);
            java.util.Date inputDate = formatter.parse(rcvDate);
            sqlDate = new java.sql.Date(inputDate.getTime());
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return sqlDate;
    }

    public static java.sql.Date getDateFromString(String rcvDate, String format, Locale locale) {
        java.sql.Date sqlDate = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format, locale);
            java.util.Date inputDate = formatter.parse(rcvDate);
            sqlDate = new java.sql.Date(inputDate.getTime());
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return sqlDate;
    }

    public static java.sql.Timestamp getTimestampFromString(String rcvDate, String format) {
        java.sql.Timestamp sqlDate = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.US);
            java.util.Date inputDate = formatter.parse(rcvDate);
            sqlDate = new java.sql.Timestamp(inputDate.getTime());
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormat" + e.getMessage());
            return null;
        }
        return sqlDate;
    }

    public static java.sql.Timestamp getTimestampCurrent(String format) {
        java.sql.Timestamp sqlDate = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat(format, Locale.US);
            java.util.Date inputDate = new java.util.Date();
            String dateStr = dateFormat.format(inputDate);
            sqlDate = getTimestampFromString(dateStr, format);
        } catch (Exception e) {
            System.err.println("Exception :: getTimestampCurrent " + e.getMessage());
            return null;
        }
        return sqlDate;
    }

    public static SimpleDateFormat getSimpleDateFormat(String pattern, Locale locale) {
        return new SimpleDateFormat(pattern, locale);
    }

    public static SimpleDateFormat getSimpleDateFormat(String pattern) {
        return new SimpleDateFormat(pattern);
    }

    /**
     * @author Tanut I.
     * Format date using desinated pattern (using Application Locale (Not default locale)
     */
    public static String format(java.util.Date date, String pattern) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    /**
     * @author Tanut I.
     * Format date using desinated pattern (using Application Locale (Not default locale)
     */
    public static String format(java.sql.Timestamp date, String pattern) {
        SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    public static java.sql.Date formatDateSql(java.sql.Timestamp date) {
        return new java.sql.Date(date.getTime());
    }

    /**
     * @author Tanut I.
     * Format date using default date pattern (using Application Locale (Not default locale)
     */
    public static String format(java.util.Date date) {
        return format(date, DEFAULT_DATE_FORMAT);
    }

    /**
     * @author Tanut I.
     * Parse date using designated pattern (using Application Locale (Not default locale)
     */
    public static java.util.Date parse(String dateString, String pattern)
            throws java.text.ParseException {
        SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE);
        if(dateString==null||"".equals(dateString)){
            return null;
        }else{
            return sdf.parse(dateString);
        }
        
    }

    public static java.util.Date parsePattern(String dateString, String pattern) {
        SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE);
        try {
            return sdf.parse(dateString);
        } catch (java.text.ParseException ex) {
        }
        return null;
    }

    /**
     * @author Tanut I.
     * Parse date using default date pattern
     */
    public static java.util.Date parse(String dateString)
            throws java.text.ParseException {
        return parse(dateString, DEFAULT_DATE_FORMAT);
    }

    public static String getCurrentTime() throws Exception {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss", Locale.US);

        return sdf.format(date);

    }

    public static String getCurrentTimeFormat(String pattern) throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);

        return sdf.format(date);
    }

    public static Date getCurrentDateTime() {
        return Calendar.getInstance().getTime();
    }

    public static String getCurrentDateString() {
        return getCurrentDateString(DEFAULT_DATE_FORMAT);
    }

    public static String getCurrentDateString(String pattern) {
        return format(getCurrentDateTime(), pattern);
    }

    public static java.sql.Date toSqlDate(java.util.Date date) {
        return date == null ? null : new java.sql.Date(date.getTime());
    }

    public static java.sql.Timestamp toTimeStamp(java.util.Date date) {
        return date == null ? null : new java.sql.Timestamp(date.getTime());
    }

    public static java.util.Date toDate(java.sql.Timestamp dateTime) {
        return dateTime == null ? null : new java.util.Date(dateTime.getTime());
    }

    public static java.util.Date toDate(java.sql.Date date) {
        return date == null ? null : new java.util.Date(date.getTime());
    }

    /**
     * Get date or time info from the Date by designated field
     * @author Tanut I
     * @param field
     * @return
     */
    public static int get(java.util.Date date, int field) {
        Calendar cal = Calendar.getInstance(APPLICATION_LOCALE);
        cal.setTime(date);
        return cal.get(field);
    }

    public static int get(java.sql.Date date, int field) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(field);
    }

    public static int getDayOfWeek(java.util.Date date) {
        return get(date, Calendar.DAY_OF_WEEK);
    }

    public static int getDayOfMonth(java.util.Date date) {
        return get(date, Calendar.DAY_OF_MONTH);
    }

    public static int getMonth(java.util.Date date) {
        return get(date, Calendar.MONTH);
    }

    public static int getYear(java.util.Date date) {
        return get(date, Calendar.YEAR);
    }

    /**
     * Check whether date is Saturday or Sunday
     * @author Tanut I
     * @param date
     * @return
     */
    public static boolean isWeekend(java.util.Date date) {
        int dayOfWeek = getDayOfWeek(date);
        return ((dayOfWeek == Calendar.SATURDAY) || (dayOfWeek == Calendar.SUNDAY));
    }

    /**
     * Check whether date is in Monday to Friday
     * Equivalent to !isWeekend(date)
     * @author Tanut I
     * @param date
     * @return
     */
    public static boolean isBusinessDay(java.util.Date date) {
        return !isWeekend(date);
    }

    /**
     * @author Tanut I
     * @param date
     * @return
     */
    public static java.util.Date clearTime(java.util.Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int d = cal.get(Calendar.DATE);
        int m = cal.get(Calendar.MONTH);
        int y = cal.get(Calendar.YEAR);
        cal.clear();
        cal.set(Calendar.DATE, d);
        cal.set(Calendar.MONTH, m);
        cal.set(Calendar.YEAR, y);
        return cal.getTime();
    }

    /**
     * Compare two Date objects by its millisecond
     *
     * @author Tanut I
     * @param field     allow SECOND, MINUTE, HOUR, DATE else MILLISECOND
     * @param startDate
     * @param endDate
     * @return  result &gt;= 0: endDate &gt;= startDate, negative: endDate &lt; startDate
     */
    public static long diff(int field, java.util.Date startDate, java.util.Date endDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        long start = cal.getTimeInMillis();

        cal.setTime(endDate);
        long end = cal.getTimeInMillis();

        long diff = end - start;
        long divider = 1L;
        switch (field) {
            case Calendar.SECOND:
                divider = 1000L;
                break;
            case Calendar.MINUTE:
                divider = 1000L * 60;
                break;
            case Calendar.HOUR:
                divider = 1000L * 60 * 60;
                break;
            case Calendar.DATE:
                divider = 1000L * 60 * 60 * 24;
                break;
            case Calendar.MONTH:
                divider = 1000L * 60 * 60 * 24 * 30;
                break;
            case Calendar.YEAR:
                divider = 1000L * 60 * 60 * 24 * 365;
                break;
            default:
                divider = 1L;
        }

        return (diff / divider);
    }

    /**
     * Compare two Date objects in number of days
     * @param startDate
     * @param endDate
     * @return
     */
    public static long dateDiff(java.util.Date startDate, java.util.Date endDate) {
        startDate = clearTime(startDate);
        endDate = clearTime(endDate);
        return diff(Calendar.DATE, startDate, endDate);
    }

    /**
     *
     * @param date
     * @param field
     * @param amount
     * @return
     */
    public static java.util.Date add(java.util.Date date, int field, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(field, amount);
        return cal.getTime();
    }

    /**
     *
     * @param date
     * @param amount
     * @return
     */
    public static java.util.Date nextDate(java.util.Date date, int amount) {
        return add(date, Calendar.DATE, amount);
    }

    public static boolean checkEqualDate(java.sql.Date date1, java.sql.Date date2) {
        boolean flag = false;
        String currdate = getDateFormat(date1, "yyyyMMdd");
        String limitDate = getDateFormat(date2, "yyyyMMdd");
        if (currdate.trim().equals(limitDate.trim())) {
            flag = true;
        }
        return flag;
    }

    public static boolean isEqualDate(java.sql.Date date1, java.sql.Date date2) {
        boolean flag = false;
        String currdate = format(date1);
        String limitDate = format(date2);
        if (currdate.trim().equals(limitDate.trim())) {
            flag = true;
        }
        return flag;
    }

    public static boolean checkEqualDate(java.sql.Date date1, java.sql.Timestamp date2) {
        boolean flag = false;
        String currdate = getDateFormat(date1, "yyyyMMdd");
        String limitDate = getDateFormat(date2, "yyyyMMdd");
        if (currdate.trim().equals(limitDate.trim())) {
            flag = true;
        }
        return flag;
    }

    public static boolean checkEqualDate(java.sql.Timestamp date1, java.sql.Timestamp date2) {
        boolean flag = false;
        String currdate = getDateFormat(date1, "yyyyMMdd");
        String limitDate = getDateFormat(date2, "yyyyMMdd");
        if (currdate.trim().equals(limitDate.trim())) {
            flag = true;
        }
        return flag;
    }
//    Adithap

    public static String getTimeFormat(java.sql.Timestamp date, String pattern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    public static String getTimeFormat(java.sql.Timestamp date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = getSimpleDateFormat(DEFAULT_TIME_FORMAT, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    public static String getTimeFormat(java.util.Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = getSimpleDateFormat(DEFAULT_TIME_FORMAT, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    public static String getDayOfWeekStr(int dayOfWeek) {
        String dayOfWeekStr = null;
        switch (dayOfWeek) {
            case 1:
                dayOfWeekStr = "SUN";
                break;
            case 2:
                dayOfWeekStr = "MON";
                break;
            case 3:
                dayOfWeekStr = "TUE";
                break;
            case 4:
                dayOfWeekStr = "WED";
                break;
            case 5:
                dayOfWeekStr = "THU";
                break;
            case 6:
                dayOfWeekStr = "FRI";
                break;
            case 7:
                dayOfWeekStr = "SAT";
                break;
        }
        return dayOfWeekStr;
    }

    /***
     *
     * @param date
     * @return time in the format of HH.mm ex., 14.54 of the specific date
     */
    public static BigDecimal getTimeStampAsBigDecimal(java.util.Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(TIME_HHMM_FORMAT);
        String strTime = sdf.format(date);
        BigDecimal bigDecimalTime = new BigDecimal(strTime);
        return bigDecimalTime;
    }

    public static Float getTimeAsFloat(java.util.Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(TIME_HHMM_FORMAT);
        String strTime = sdf.format(date);
        Float floatTime = new Float(strTime);
        return floatTime;
    }

    public static String getTimeAsString(java.util.Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = getSimpleDateFormat(DEFAULT_TIME_FORMAT, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    public static String getTimeAsString(java.util.Date date, String pattern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = getSimpleDateFormat(pattern, APPLICATION_LOCALE);
        return sdf.format(date);
    }

    /**
     * Check dayOfWeek from String date that is equals dayOfWeek from chkDayOfWeek
     * Ex, would like to checks 08-04-2008 is Tuesday or not
     * @param stringDate
     * @param chkDayOfWeek
     * @return
     * @throws java.text.ParseException
     */
    public static boolean isDayOfWeekByDate(String stringDate, int chkDayOfWeek) throws ParseException {
        java.util.Date date = parse(stringDate);
        int dayOfWeekFromStrDate = get(date, Calendar.DAY_OF_WEEK);
        if (dayOfWeekFromStrDate == chkDayOfWeek) {
            return true;
        } else {
            return false;
        }
    }

//  numMonth input -1 is backword one month
//  numMonth input 1 is forword one month
    public static Date getDateByDayOfWeek(Date dateRcv, int numMonth) {
        Calendar cal = Calendar.getInstance();
        Date dateRet = null;
        cal.setTime(dateRcv);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        Calendar calRet = Calendar.getInstance();
        calRet.setTime(dateRcv);
        calRet.add(Calendar.MONTH, numMonth);
        calRet.set(Calendar.DAY_OF_WEEK, dayOfWeek);
        calRet.set(Calendar.WEEK_OF_MONTH, weekOfMonth);

        int i = 1;
        while (calRet.get(Calendar.MONTH) == cal.get(Calendar.MONTH)) {
            calRet.setTime(dateRcv);
            calRet.add(Calendar.MONTH, numMonth);
            calRet.set(Calendar.DAY_OF_WEEK, dayOfWeek);
            calRet.set(Calendar.WEEK_OF_MONTH, weekOfMonth - i);
        }
        dateRet = new Date(calRet.getTimeInMillis());
        return dateRet;
    }

    public static Date getDateConvertMonth(Date dateRcv, int numMonth) {
        Date dateRet = null;
        Calendar calRet = Calendar.getInstance();
        calRet.setTime(dateRcv);
        calRet.add(Calendar.MONTH, numMonth);
        dateRet = new Date(calRet.getTimeInMillis());
        return dateRet;
    }

    public static Date getFirstDateOfMonth(Date dateRcv) {
        Date dateRet = null;
        Calendar calRet = Calendar.getInstance();
        calRet.setTime(dateRcv);
        calRet.set(Calendar.DATE, 1);
        dateRet = new Date(calRet.getTimeInMillis());
        return dateRet;
    }

    public static Date getLastDateOfLastMonth(Date dateRcv) {
        Date dateRet = null;
        Calendar calRet = Calendar.getInstance();
        calRet.setTime(dateRcv);
        calRet.set(Calendar.DATE, 1);
        calRet.add(Calendar.DATE, -1);
        dateRet = new Date(calRet.getTimeInMillis());
        return dateRet;
    }

    public static List<java.util.Date> getListDate(String fromDateRcv, String toDateRcv, int step) throws Exception {
        List<java.util.Date> list = new ArrayList<java.util.Date>();
        java.util.Date fromDate = DateUtil.parse(fromDateRcv);
        java.util.Date toDate = DateUtil.parse(toDateRcv);
        while (fromDate.compareTo(toDate) <= 0) {
            list.add(new java.util.Date(fromDate.getTime()));
            fromDate = DateUtil.nextDate(fromDate, step);
        }
        return list;
    }

    public static List<Date> getListByDayOfWeekAndInterval(Date dateRcv, int backWordMonth) {
        List<Date> list = new ArrayList<Date>();
       
        for (int i = 0; i <= Math.abs(backWordMonth); i++) {
            list.addAll(getListBackwardDate(dateRcv, i * backWordMonth / Math.abs(backWordMonth)));
        }
        return list;
    }

    private static List<Date> getListBackwardDate(Date dateRcv, int index) {
        Calendar cal = Calendar.getInstance();
        List<Date> list = new ArrayList<Date>();
        cal.setTime(dateRcv);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int maxDayOfWeekInMonth = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
        int minDayOfWeekInMonth = cal.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH);
      

        Calendar tempCal = Calendar.getInstance();
        tempCal.setTime(dateRcv);

        tempCal.add(Calendar.MONTH, index);
        tempCal.set(Calendar.DAY_OF_WEEK, dayOfWeek);
        tempCal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);

        int tempMaxDayOfWeekInMonth = tempCal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
        int tempMinDayOfWeekInMonth = tempCal.getActualMinimum(Calendar.DAY_OF_WEEK_IN_MONTH);

        if ((dayOfWeekInMonth == minDayOfWeekInMonth)) {
            if (index != 0) {
                tempCal.set(Calendar.DAY_OF_WEEK_IN_MONTH, tempMinDayOfWeekInMonth);
                list.add(0, tempCal.getTime());
            }
        } else if (dayOfWeekInMonth == maxDayOfWeekInMonth) {
            if (index != 0) {
                
                tempCal.set(Calendar.DAY_OF_WEEK_IN_MONTH, tempMaxDayOfWeekInMonth);
                list.add(0, tempCal.getTime());
            }
        } else {
            if (index == 0) {
                for (int k = minDayOfWeekInMonth + 1; k < dayOfWeekInMonth; k++) {
                    tempCal.set(Calendar.DAY_OF_WEEK_IN_MONTH, k);
                    list.add(0, tempCal.getTime());
                }
            } else {
                for (int k = tempMinDayOfWeekInMonth + 1; k < tempMaxDayOfWeekInMonth; k++) {
                    tempCal.set(Calendar.DAY_OF_WEEK_IN_MONTH, k);
                    list.add(0, tempCal.getTime());
                }
            }

        }
        return list;
    }

    public static String getTargetDate(String dateRcv, int numMonth) throws Exception {
        String dateRet = "";
        java.util.Date date = DateUtil.parse("01" + dateRcv.substring(dateRcv.indexOf("-")));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, numMonth);
        dateRet = DateUtil.format(new java.util.Date(cal.getTimeInMillis()));
        return dateRet;
    }

    public static String getCurrentDate() {
        return getCurrentDate(DEFAULT_DATE_FORMAT + " " + DEFAULT_TIME_FORMAT, DEFAULT_TIMEZONE_PATTERN);
    }

    /**
     * getCurrentDate use to get Current Date&time
     * note : all parameter are optional
     * @param : pattern - result pattern timeZone - result timezone
     * @return: string current date in format pattern and timeZone
     *
     */
    public static String getCurrentDate(String pattern, String timeZone) {
        String result = "";
        if (pattern.equals("")) {
            pattern = "yyyy-MM-dd";
        }

        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new java.util.Date());
            DateFormat df = new SimpleDateFormat(pattern);
            if (!timeZone.equals("")) {
                df.setTimeZone(TimeZone.getTimeZone(timeZone));
            }
            //result = df.format(cal.getTime());
            Date curDate = new java.util.Date();
            result = df.format(cal.getTime());
           
        } catch (Exception e) {
            //Trace.printErrorOut(Common.class,"Error in getCurrentDate : get current date/datetime error.");
        }

        return result;
    }

    public static String getDateInThaiFormat(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat f = getSimpleDateFormat(DEFAULT_DATE_FORMAT, APPLICATION_LOCALE_TH);
        return f.format(date);
    }

    public static String getDateTimeInThaiFormat(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat f = getSimpleDateFormat(DEFAULT_DATETIME_FORMAT, APPLICATION_LOCALE_TH);
        return f.format(date);
    }

    public static String getTextDateTimeInThaiFormat(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat f = getSimpleDateFormat(DEFAULT_TEXT_DATE_FORMAT, APPLICATION_LOCALE_TH);
        return f.format(date);
    }

    public static String getDateTimeInThaiFormat(Date date, String format) {
        if (date == null) {
            return "";
        }
        if (format == null || "".equals(format)) {
            format = DEFAULT_DATETIME_FORMAT2;
        }
        SimpleDateFormat f = getSimpleDateFormat(format, APPLICATION_LOCALE_TH);
        return f.format(date);
    }

    /***
     * Roll date by amount. Can be roll up or down by sign of amount such as
     * rollDate(new Date() , 5) is 5 dates from now
     * rollDate(new Date(), -3) is before 3 date from now
     * @param date
     * @param amount
     * @return
     */
    public static java.util.Date addOrSubtractDate(java.util.Date date, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, amount);
        return cal.getTime();
    }

    /***
     *
     * @param time : time in 24hr format
     * @return java.util.Date
     */
    public static java.util.Date addTimeToDate(Date currentDate, Float fTime) {
        Date newDate = null;
        String dateInString = format(currentDate);
        DateFormat df = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);
        if (fTime == null) {
            fTime = new Float(0);
        }
        //ensure that a time will be in the format 0.00
        NumberFormat nf = new DecimalFormat("0.00");
        String time = nf.format(fTime);
        
        try {
            newDate = df.parse(dateInString + " " + time);
            
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return newDate;
    }

    public static boolean isSameDay(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
                && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
    }

    public static boolean isSameDay(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
       
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameDay(cal1, cal2);
    }

    public static boolean isLessOrSameDate(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
                && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.DAY_OF_YEAR) <= cal2.get(Calendar.DAY_OF_YEAR));
    }

    public static boolean isGraterDate(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA)
                && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.DAY_OF_YEAR) > cal2.get(Calendar.DAY_OF_YEAR));
    }

    public static int compareDate(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return cal1.compareTo(cal2);
    }

    public static Map<Integer, String> getThaiMonthMap(){
        Map<Integer, String> monthMap = new HashMap();
        for (int i = 0; i < ThaiFullDate.length; i++) {
            monthMap.put(i+1, ThaiFullDate[i]);
        }
        return monthMap;
    }
    
    public static String genBatchNoFromDate(){
        String dateformat = format(new Date(), BATCH_NO_FORMAT);
        return dateformat;
    }
    
    public static void main(String[] args) {
        System.out.println("getBatchNoFromDate: "+genBatchNoFromDate());
        getStartEndDate(1, 9, 2555);
        getStartEndDate(2, 9, 2555);
        getStartEndDate(3, 9, 2555);

    }




    public static String getDateFormatIgnoreLocale(Date date, String format) {
        String dateStr = "";
        try {
//            java.util.Date utilDate = new java.util.Date(rcvDate.getTime());
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            dateStr = formatter.format(date);
        } catch (Exception e) {
            System.err.println("Exception :: getDateFormatIgnoreLocale" + e.getMessage());
            return null;
        }
        return dateStr;
    }

    public static boolean isDateTime(String dateString, String pattern) {

        Date d = null;

        try {
            SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.US);
            format.setLenient(false);  //This line must be in code
            d = format.parse(dateString);
        } catch (Exception ex) {
            return false;
        }
        return d != null ? true : false;
    }

    public static String getTimeYear(Date date) {
        int year = 0;
        int thisY = new Date().getYear();
        int thisM = new Date().getMonth();
        int thisD = new Date().getDate();
        int currYr = date.getYear();
        int currM = date.getMonth();
        int currD = date.getDate();

        if (thisY < currYr) {
            return "0";
        } else if (thisY == currYr) {
            if (thisM < currM) {
                return "0";
            } else if (thisM == currM) {
                if (thisD > currD) {

                    return "0.1";
                } else if (thisD == currD) {

                    return "0";
                } else {

                    return "0";
                }
            } else {
                return "0.1";
            }
        } else {
            if (thisM < currM) {
                year = thisY - currYr - 1;
                return year + ".1";
            } else if (thisM > currM) {
                year = thisY - currYr;
                return year + ".1";
            } else {
                if (thisD > currD) {
                    year = thisY - currYr;
                    return year + ".1";
                } else if (thisD == currD) {
                    year = thisY - currYr;
                    return year + "";
                } else {
                    year = thisY - currYr - 1;
                    return year + ".1";
                }
            }
        }
    }

    /***
     *@dateRangeType :
     * week 1 = day 1-7
     * week 2 = day 8-14
     * week 3 = day 15-21 
     * week 4 = day 22-31
     * @thaiYear : thai year format ex,. 2555
     * 
     * @return 
     * Date[0] = startDate
     * Date[1] = endDate
     ****/
    static int[] startArr = {1, 8, 15, 22};
    static int[] endArr = {7, 14, 21, 31};
    static String SLASH = "/";
    public static Date[] getStartEndDate(int week, int mounth, int thaiYear) {
        if(week == 0){
            throw new IllegalArgumentException("invalid week, must start with 1");
        }
        StringBuilder dateForm1 = new StringBuilder();
        StringBuilder dateForm2 = new StringBuilder();
        Date[] date = new Date[2];
        dateForm1.append(startArr[week-1]).append(SLASH).append(mounth).append(SLASH).append(thaiYear - 543);
        dateForm2.append(endArr[week-1]).append(SLASH).append(mounth).append(SLASH).append(thaiYear - 543);
        date[0] = getDateFromString(dateForm1.toString(), DEFAULT_DATE_FORMAT);
        date[1] = getDateFromString(dateForm2.toString(), DEFAULT_DATE_FORMAT);
        return date;
    }
    
    public static java.sql.Date sysDate() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.util.Date c1 = cal.getTime();
        java.sql.Date c2 = new java.sql.Date(c1.getTime());
        return c2;
    }
}
