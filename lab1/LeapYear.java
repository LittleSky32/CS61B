/*
 * @Author: LittleSky32 skyshao0908@gmail.com
 * @Date: 2023-07-13 08:52:58
 * @LastEditors: LittleSky32 skyshao0908@gmail.com
 * @LastEditTime: 2023-07-13 23:23:54
 * @FilePath: \Users\Public\cs61b\lab1\LeapYear.java
 * @Description: 
 * 
 * Copyright (c) 2023 by ${git_name_email}, All Rights Reserved. 
 */
/** Class that determines whether or not a year is a leap year.
 *  @author Sky
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    public static boolean isLeapYear(int year){
        if((year %4 == 0 & year % 100 != 0) | (year % 400 == 0)){
            return true;
        }
        return false;
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
}

