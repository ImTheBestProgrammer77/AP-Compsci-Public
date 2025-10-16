/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interestratecalculator;

/**
 *
 * @author AMoylan2026
 */

import java.util.*;
import java.text.NumberFormat;

/*
Write a public main method that uses a different class called InterestRateCalculator
The main should call for a user to input a financial amount (say $1,000,000)
The main should then call a method in the Class that adds an interest rate amount to the amount input and passes it back to the main.
Then ask for the number of months for repayment.
The Class should have a public constant called RATE, which has a rate value (3.5% or 10% or whatever you choose). All other variables should be private.
The Class should have a public method which takes the amount as input. The Class will then calculate the compound interest payments. 
The Class should divide the amount by the number of months.
The first month, the borrower will have to pay the monthly amout plus interest. 
The remaining amount should also be increased by the interest rate.
Next payment should divide the remaining amount by the number of months left, and present that monthly amount plus the interest.
Ouput should be the month, that month's payment, as well as the total amount paid so far.
Remember to show the amounts in currency format, interest in percentage format and so on.
Ensure all Classes, Variables, methods etc. have only the correct required visibility.
Only the variables/methods that should be accessed from outside should be available from outside - everything else private to the Class.
The InterestRateCalculator should be a "black box". Remember to plan your project, and comment your code throughout.
*/


//plan: public method would be set months and set money
//      calculate intrest use a loop to do for however many months entered
//      print out to string in the end




public class InterestRateCalculator {

    public static void main(String[] args) {
        
        //set up variables
        double dblMoney;
        int intMonths;
        //get amounts of money and months
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a dollar amount:");
        dblMoney = scan.nextDouble();
        System.out.println("Enter number of payments:");
        intMonths = scan.nextInt();
        
        //set up interest rate calculator and print RATE
        InterestRateCalc irc = new InterestRateCalc();
        System.out.println(irc);
        
        //set money and months and calculate interest
        irc.setMoney(dblMoney);
        irc.setMonths(intMonths);
        irc.calculateInterest();
        
    }
}

class InterestRateCalc {
    
    //set up variables in InterestRateClass
  public double RATE = 0.05;
  private double money;
  private int months;
  private double amountM;
  private double amountR;
  private String strAmount;
  
  //public method set money
  public void setMoney(double inM){
      money = inM;
}
  //public method set months
  public void setMonths (int inMt){
      months = inMt;
  }
  
  //public method calculate
  public void calculateInterest (){
      
    //loop for months amount of times
  for ( int i = 1; i <= months; i++) {
     System.out.println("Monthly payment " + i); 
     
     //math and print out
     amountM =(money/months);
      amountR = amountM + amountM * RATE;
      NumberFormat formatDollars = NumberFormat.getCurrencyInstance(Locale.US);
      strAmount = formatDollars.format(amountR);
      System.out.println(strAmount);
      money = money - amountM;
      months--;
      
  }
  }
  
  //public method to String to print out RATE
  public String toString(){
            String myString = "My interest rate is " + RATE;
                   
            return myString;
  }
}