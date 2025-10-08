/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formattingclass;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;


/**
 *
 * @author AMoylan2026
 */
public class FormattingClass {

    public static void main(String[] args) {
       /*1. Ask for total number of students at a school (any school).
        Now ask for the number of girls at that school. Using Number formatting, 
        output the % of girls and % of boys at that school.
*/
       //set up variables
       double intStu, intGirls, intBoys;
       double dblGirls, dblBoys;
       Scanner scan = new Scanner(System.in);
       
       //get total and girls values
       System.out.println("Enter total number of students at school:");
       intStu = scan.nextInt();
       System.out.println("Enter total number of girls at school");
       intGirls = scan.nextInt();
       
       //Do math and print student totals
       intBoys = intStu - intGirls;
       System.out.println("Total number of students: " + intStu);
       System.out.println("Total number of girls: " + intGirls);
       System.out.println("Total number of boys: " + intBoys);
       
       //Do math to get percents and format and print
       dblGirls = intGirls / intStu;
       dblBoys = intBoys / intStu;
       
       NumberFormat percentFormat = NumberFormat.getPercentInstance();
       
       System.out.println("Percent of students that are girls: " + percentFormat.format(dblGirls));
       System.out.println("percent of students that are boys: " + percentFormat.format(dblBoys));  
       
       
/*2.Ask for total amout of money in Dollars and Cents. The method must convert this value to British Pounds
 (gbp - Exchange rate on 9/26 is 0.75 pence to 1$). Output the number of Pounds, mentioning the exchange rate,
  in a British (locale) number format. Do the same for the Euro (86 eCents to 1$ today)
 */      
       //Set up variables
       double dollars, dblPounds, euros;
       String strDoll, strPou, strEu; 
       //ask for money amount
       System.out.println("Enter money in dollars and cents");
       dollars = scan.nextDouble();
       
       NumberFormat formatDollars = NumberFormat.getCurrencyInstance(Locale.US);
       strDoll = formatDollars.format(dollars);
       //convert to british pounds
       
       NumberFormat formatPounds = NumberFormat.getCurrencyInstance(Locale.UK);
       dblPounds = dollars * (0.75);
       strPou = formatPounds.format(dblPounds);
       
       // convert to euros
       NumberFormat formatEuros = NumberFormat.getCurrencyInstance(Locale.ITALY);
       euros = dollars * (0.86);
       strEu = formatEuros.format(euros);
       
       //print out values
       System.out.println("Money in dollars: " + strDoll);
       System.out.println("Money in Pounds-exchange rate .75 to 1 dollar- : " + strPou);
       System.out.println("Money in Euros -exchange rate 86 eCents to 1 dollar- : " + strEu);
       
/*3. Ask for an integer from 0 to 15, and based on the input, format the number Pi
(from the Math class) to that number of decimal places, and print it out appropriately.
*/

    //Set up variables
    int places;
    double piRound;
    //get value
    System.out.println("Enter number of places to round pi");
    places = scan.nextInt();
    
    //format pi
    piRound = roundAvoid(Math.PI, places);
    
    //print
    System.out.println("PI rounded to " + places + " places = " + piRound);

/*4. Generate a random number from 100,000,000 to 999e18as a decimal number (no scientific notation). 
*/  

    //set up variables
    Random ranValue = new Random();
    double value;
    
    //get number
    value = ranValue.nextInt(1000000000);
    
    //format
    DecimalFormat format = new java.text.DecimalFormat("#,###,###,###.##");
    //print
    System.out.println("Number is: " + format.format(value));

}
    public static double roundAvoid(double value, int places) {
     double scale = Math.pow(10,places);
     return Math.round(value * scale) / scale;
 }   
}
