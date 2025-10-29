/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyear;

/**
 *
 * @author AMoylan2026
 */
import java.util.*;

/*Write a program that reads an integer value from the user rep-
resenting a year. The purpose of the program is to determine if
the year is a leap year (and therefore has 29 days in February)
in the Gregorian calendar. Use a boolean variable isLeapYear for 
this (initialize to false).  

A year is a leap year if it is divisable by 4, unless it is also 
divisable by 100 but not 400. For example, the year 2003 is not a leap year, 
but 2004 is. The year 1900 is not a leap year because it is divisable by 
100 but not 400, and the year 2000 is a leap year because it is divisable by
100, and also divisable by 400. Produce an error message for
any input value less than 1582 (the year the Gregorian calendar
was adopted).*/

//Plan:
//if < 1582 = ERROR
//if not, divide by 4
//if divisible by 4 , dvide by 100
//if not = NO
//if divisible by 100, divide by 400
//if not = Yes
//if divisible by 400 = YES
//if not = NO

public class LeapYear {

    public static void main(String[] args) {
        
        //Set up variables/scanner
        boolean leapYear = false;
        int year;
        final int START = 1582;
        Scanner scan = new Scanner(System.in);
        
        //get year number
        System.out.println("Leap Year Calculator!");
        System.out.println();
        System.out.println("Imput Year:");
        year = scan.nextInt();
        
        //Do calculations and print answer
        
        if (year < START){
            System.out.print("ERROR: year entered is not on Gregorian Calendar so: ");
        }else{
            if (year%4 == 0){
                if (year%100 == 0){
                    if (year%400 == 0){
                        leapYear = true;     
                    }else{
                        leapYear = false;
                    }
                }else{
                    leapYear = true;
                }
            }else{
                leapYear = false;
            }
        }
        
        if (leapYear == true){
            System.out.println("Yep, it's a leap year!");
        }else{
            System.out.println("Nope, not a leap year :(");
        }
    }
}
