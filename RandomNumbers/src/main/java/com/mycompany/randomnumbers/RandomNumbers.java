/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumbers;



/**
 *
 * @author AMoylan2026
 */

import java.util.*;
public class RandomNumbers {

    
    
    public static void main(String[] args) {
        System.out.println("Press p to generate a phone number");
        System.out.println("Press r to roll a six sided die");
        
        /*Part 1 - Phone Number Generator

Plan and write a program that generates random phone numbers in the pattern XXX-XXX-XXXX. Include the dashes in the output.

Do not let the first 3 digits contain the numbers 8 or 9 (but don't be any more restrictive than that).*/
/*Make sure the second set of 3 digits does not go higher than 655 (so 000 to 655 OK, 656 not OK).       
Recall that all 3 sets can have the digit 0 anywhere in the set (so 071-010-0210 is fine)
Think through the easiest way to construct the phone number. Each of the 10 digits does not have to be determined individually
For a bonus point, place it inside a loop, and when the user presses the letter "p", it will generate a new one.*/
        Random num = new Random();
        int num0;
        int num1;
        int num2;
        int num3;
       
        String phone = "";
        Scanner p = new Scanner(System.in);
        phone = p.next();
    while(phone.equalsIgnoreCase("p")){
        System.out.println("Your phone number is:");
        //first 3 digits
        num0 = num.nextInt(8);
        num1 = num.nextInt(8);
        num2 = num.nextInt(8);
        System.out.print(num0);
        System.out.print(num1);
        System.out.print(num2 + "-");

        //second 3 digits
        num0 = num.nextInt(7);
        num1 = num.nextInt(6);
        num2 = num.nextInt(6);
        System.out.print(num0);
        System.out.print(num1);
        System.out.print(num2 + "-");
        
        //last 4 digits
        num0 = num.nextInt(10);
        num1 = num.nextInt(10);
        num2 = num.nextInt(10);
        num3 = num.nextInt(10);
        System.out.print(num0);
        System.out.print(num1);
        System.out.print(num2);
        System.out.println(num3);
        System.out.println("Enter p for a new phone number or x to go back");
        phone = p.next();
    }
/*Part 2 - 6 sided Die generator
Plan and write a program that randomly generates an integer from 1 to 6.

for a bonus point, put it inside a loop, and each time the user types the letter "r", it "rolls the dice" and generates another random number, from 1 to 6.

Keep the die generator in mind, as it will come into use in the next unit.*/
        
System.out.println("press r to roll a six sided die");
    Random die = new Random ();
    int intDie;
    
    String r;
    Scanner roll = new Scanner(System.in);
    r = roll.next();
    
    
    while(r.equalsIgnoreCase("r")){
        //generate random die roll
        intDie = die.nextInt(6)+ 1;
        System.out.println("Your roll is: " + intDie);
       //restart process
        System.out.println("Enter r for new roll or x to end");
        r = roll.next();
    }
}
}
