/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correctchange;

/**
 *
 * @author AMoylan2026
 */

//import Scanner
import java.util.Scanner;


public class CorrectChange {

    public static void main(String[] args) {
       
        //Write a program that prompts for and reads a double value representing a monetary amount (the change). 
        //Then determine the fewest number of each bill and coin needed to represent that amount, starting with the highest.
        //Assume that a ten dollar bill is the highest you have in this case.
        //Hint - remember int and double casting and division and remainders.
        
       //Plan:
       //Set up Scanner and variables
       // get imput money
       // divide by ten and make that Tens amount
       //divide remainder by 5 and make that fives amount
       //ecetera
       //print all variables out
       
       
       //Set up Scanner 
        Scanner scan = new Scanner(System.in);
       
       //Set up variables
       double dblChange;
       int intTens;
       int intFives;
       int intOnes;
       int intQuarters;
       int intDimes;
       int intNickels;
       int intPennies;
       double dblPennies;
       double dblRdr; 
       
       //Get imput money amount

        System.out.println("Input money amount in dollars and cents:");
        dblChange = scan.nextDouble();
        System.out.println(dblChange + " equals:");
        
       // divide by ten and make that Tens amount and print intTens
       
       intTens = (int)dblChange/10;
       System.out.println(intTens + " ten-dollar bills");
       
       //divide remainder by 5 and make that fives amount
       dblRdr = dblChange%10;
       intFives = (int)dblRdr/5;
       System.out.println(intFives + " five-dollar bills");
       
       //divide remainder by 1 and make that ones amount
       
       dblRdr = dblChange%5;
       intOnes = (int)dblRdr/1;
       System.out.println(intOnes + " one-dollar bills");
       
       //divide remainder by .25 and make that quarters amount
       
       dblRdr = dblChange%1;
       //System.out.println(dblRdr);
       intQuarters = (int)(dblRdr/(0.250));
       System.out.println(intQuarters + " Quarters");
        
      //divide remainder by .1 make that dimes amount
      
      dblRdr = dblChange%(0.250);
       //System.out.println(dblRdr);
       intDimes = (int)(dblRdr/(0.10));
       System.out.println(intDimes + " Dimes");
       
       //divide remainder by .05 make that Nickels amount
       dblRdr = dblChange%(0.10);
       //System.out.println(dblRdr);
       intNickels = (int)(dblRdr/(0.050));
       System.out.println(intNickels + " Nickels");
       
       //divide remainder by 0.01 and make that the Pennies amount
      
       dblRdr = dblChange%(0.050);
       //System.out.println(dblRdr);
       dblPennies = (dblRdr/(0.009));
       intPennies = (int)(dblPennies);
       System.out.println(intPennies + " Pennies");
    }
}
