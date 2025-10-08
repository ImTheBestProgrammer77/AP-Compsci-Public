/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wrapper.enumerated;

import java.util.*;


/**
 *
 * @author AMoylan2026
 */
public class WrapperEnumerated {

    public static void main(String[] args) {
        
        /*1a)  Write a main method that creates an enumeration of the days in the week. 
        Once the enum has been created and the day in the week variables filled, print them all out, 
        but rather than the zero based ordinals, print out the days in the week (1-7).*/
        
        //set up
        enum Week {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
        
        //variables
        Week day1, day2, day3, day4, day5, day6, day7;
        
        day1 = Week.Sunday;
        day2 = Week.Monday;
        day3 = Week.Tuesday;
        day4 = Week.Wednesday;
        day5 = Week.Thursday;
        day6 = Week.Friday;
        day7 = Week.Saturday;
        
        //print
        System.out.println(day1 + " is the " + (day1.ordinal()+1) +"st day of the week." );
        System.out.println(day2 + " is the " + (day2.ordinal()+1) +"nd day of the week." );
        System.out.println(day3 + " is the " + (day3.ordinal()+1) +"rd day of the week." );
        System.out.println(day4 + " is the " + (day4.ordinal()+1) +"th day of the week." );
        System.out.println(day5 + " is the " + (day5.ordinal()+1) +"th day of the week." );
        System.out.println(day6 + " is the " + (day6.ordinal()+1) +"th day of the week." );
        System.out.println(day7 + " is the " + (day7.ordinal()+1) +"th day of the week." );
        
        /*1b) Write a main method that creates an enumeration of the months in the year. 
        Once the enum has been created and the month variables filled, print them out, 
        but not with the enum ordinals, but the "month in the year" numbers (1-12).*/

        //set up
        enum Year {January, Febuary, March, April, May, June, July, August, September, October, November, December}
        
        //variables
        Year jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec;
        
        jan = Year.January;
        feb = Year.Febuary;
        mar = Year.March;
        apr = Year.April;
        may = Year.May;
        jun = Year.June;
        jul = Year.July;
        aug = Year.August;
        sep = Year.September;
        oct = Year.October;
        nov = Year.November;
        dec = Year.December;
       
        //print
        System.out.println();
        System.out.println(jan + " is the " + (jan.ordinal()+1) +"st month of the year." );
        System.out.println(feb + " is the " + (feb.ordinal()+1) +"nd month of the year." );
        System.out.println(mar + " is the " + (mar.ordinal()+1) +"rd month of the year." );
        System.out.println(apr + " is the " + (apr.ordinal()+1) +"th month of the year." );
        System.out.println(may + " is the " + (may.ordinal()+1) +"th month of the year." );
        System.out.println(jun + " is the " + (jun.ordinal()+1) +"th month of the year." );
        System.out.println(jul + " is the " + (jul.ordinal()+1) +"th month of the year." );
        System.out.println(aug + " is the " + (aug.ordinal()+1) +"th month of the year." );
        System.out.println(sep + " is the " + (sep.ordinal()+1) +"th month of the year." );
        System.out.println(oct + " is the " + (oct.ordinal()+1) +"th month of the year." );
        System.out.println(nov + " is the " + (nov.ordinal()+1) +"th month of the year." );
        System.out.println(dec + " is the " + (dec.ordinal()+1) +"th month of the year." );
     
/*2) Write a main method which asks for your CCHS username (including graduation year).
It must create a string of the username, as well as a string of the year part 
(use substring method of String object). Recall all the years have a length of 4 characters.
Use an Integer object to parse the int value of that string. Have the method print your graduation year, 
as well as say what the year after your graduation year will be by adding 1 to the parsed int value.
*/

        //set up
        Character obj;
        String username, gradYear;
        int intGradYear;
        Scanner scan = new Scanner(System.in);
 
        //ask for username
        
        System.out.println();
        System.out.println("Enter your CCHS username");
        username = scan.next();
        System.out.println(username);
        gradYear = username.substring(username.length() - 4);
        System.out.println("grad year is " + gradYear);
        intGradYear = Integer.parseInt(gradYear);
        System.out.println("Year after grad year is " + ( intGradYear + 1));
       
    }
}
