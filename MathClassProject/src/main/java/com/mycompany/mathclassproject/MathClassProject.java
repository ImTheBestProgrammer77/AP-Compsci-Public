/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathclassproject;

/**
 *
 * @author AMoylan2026
 */

import java.util.*;

public class MathClassProject {

    public static void main(String[] args) {
        /* 1. Write a program that generates a random number in the range 0 to 90 inclusive. 
        Using the Math class, display the sine, cosine and tangent for that number, rounded to 3 decimal places,
        in the format: "Number: 45 Sine: 0.851 Cosine: 0.525 Tangent: 1.620"*/
        
        //set up variables
        Random angle = new Random();
        int intAngle;
        double sin, cos, tan;
        
        //generate angle
        intAngle = angle.nextInt(91);
        
        //do the math
        sin = Math.sin(intAngle);
        cos = Math.cos(intAngle);
        tan = Math.tan(intAngle);
        sin = roundAvoid(sin, 3);
        cos = roundAvoid(cos, 3);
        tan = roundAvoid(tan, 3);
        
        //print out answers
        System.out.println("Random Angle =" + intAngle);
        System.out.println("Sine of " + intAngle + " = " + sin);
        System.out.println("Cosine of " + intAngle + " = " + cos);
        System.out.println("Tangent of " + intAngle + " = " + tan);
        
/* 2. Generate another random real number, value 1.0 to20.0, to generate the radius of a circle.
Use  the MathClass to calculate the  area of that circle 
as well as the volume of a sphere of that radius, all rounded to 3 decimal places.*/
    
        //initialize variable
        Random radius = new Random();
        double dblRadius;
        double area, volume;
        
        //generate a radius
        dblRadius = radius.nextDouble(20) + 1;
        dblRadius = roundAvoid(dblRadius, 3);
        
        //do the math
        area = Math.PI * Math.pow(dblRadius, 2);
        volume = (4/3) * Math.PI * Math.pow(dblRadius, 3);
        area = roundAvoid(area, 3);
        volume = roundAvoid(volume,3);
        
        //print out answers
        System.out.println(" ");
        System.out.println("Radius = " + dblRadius);
        System.out.println("Area of circle = " + area);
        System.out.println("Volume of circle = " + volume);
        
/*3. Generate a random real number in the range 1000.0 to 100,000,000,.0, and using the Math Class, 
display that number, it's square root, as well as it'snatural logarithm and it's Log10 values, all rounded to 5 decimal places.*/
        
        //initialize variable
        Random num = new Random();
        Double dblnum, dblSqrt, dblln, logTen;
        
        //generate number
        dblnum = num.nextDouble(99999000)+ 1000;
        dblnum = roundAvoid(dblnum, 5);
        
        //get square root
        dblSqrt = Math.sqrt(dblnum);
        dblSqrt = roundAvoid(dblSqrt, 5);
        
        //get natural log
        dblln = Math.log(dblnum);
        dblln = roundAvoid(dblln, 5);
        
        //get log10
        logTen = Math.log10(dblnum);
        logTen = roundAvoid(logTen, 5);
        
                
        //Print out all answers
       System.out.println(" ");
       System.out.println("Random number is " + dblnum);
       System.out.println("Square root equals " + dblSqrt);
       System.out.println("Natural Log equals " + dblln);
       System.out.println("Log10 equals " + logTen);
       
/*4. Using the high real number value just generated, calculate the Mass required (in Grams) to generate that much energy.
(E = mc ^2). Hint, if speed of light (c) is in m/s, the mass will be in grams - so assume your large number is in joules (j).
Look up the value of c in m/s. Use the "roundAvoid" method to output this number to a user defined number of decimal places.*/

    //set up variables
    double mass;
    double c = 300000000;
    
    //get value of mass
    mass = dblnum / Math.pow(c, 2);
    
    //round
    mass = roundAvoid(mass, 15);
    
    //print
    System.out.println(" ");
    System.out.println("E = " + dblnum);
    System.out.println("Mass = " + mass);

/* 5. Use a scanner to get a real number value and an integer input by the user. Output the value to the power of the integer,
using the Math Class methods, again rounded to a user input number of decimal places.*/
    
    //setup scanner
    Scanner scan = new Scanner(System.in);
        
    //variables
    
    double number;
    int intPow;
    double dblTot;
    int intPlaces;
    //get values
   System.out.println(" ");
   System.out.println("Enter a real number value");
    number = scan.nextDouble();
   System.out.println("Enter an integer");
    intPow = scan.nextInt();  
   System.out.println("Enter number of decimal places");
    intPlaces = scan.nextInt();
    //math
    dblTot = Math.pow(number, intPow);
    dblTot = roundAvoid(dblTot, intPlaces);
    //print
    System.out.println(number + " to the power of " + intPow + " is " + dblTot);
    
    }
    
 public static double roundAvoid(double value, int places) {
     double scale = Math.pow(10,places);
     return Math.round(value * scale) / scale;
 }   
}
