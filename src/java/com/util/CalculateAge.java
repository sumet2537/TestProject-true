/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.util.Date;

/**
 *
 * @author BeeByThailand
 */
public class CalculateAge {

    public int getAge(int year, int month, int day) {
        Date now = new Date();
        
        int nowMonth = now.getMonth() + 1;
        int nowYear = now.getYear() + 1900;
        int result = nowYear - year;

        if (month > nowMonth) {
            result--;
        } else if (month == nowMonth) {
            int nowDay = now.getDate();

            if (day > nowDay) {
                result--;
            }
        }
        return result;
    }
   
//    public static void main(String[] args) {
//        CalculateAge calculateAge = new CalculateAge();
//        System.out.println("Age=="+calculateAge.getAge(1992, 12, 16));
//    }
//    public static void main(String[] args) throws Exception {
//    String target = "2012-12-16";
//    DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//    Date result =  df.parse(target);  
//    System.out.println(result);
//}
}
