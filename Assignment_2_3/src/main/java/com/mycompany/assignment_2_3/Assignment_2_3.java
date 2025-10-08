/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment_2_3;

/**
 *
 * @author AMoylan2026
 */
public class Assignment_2_3 {

    public static void main(String[] args) {
       
        //1) Dividable by 2 - show me a line that shows the remainder from 3 divided by 2, then 4 divided by 2
        
        System.out.println("3%2 = " + 3%2);
        System.out.println("4%2 = " + 4%2);
        
        //2) Show me an expression that includes the variables car, bus, passengers and averagePrice that correctly calculates the 
        //average cost per passenger for 4 passengers in a car and 24 passengers in a bus when it costs $4.00 gas in total for the  
        //car trip and $8.50 deisel total for the same trip by a bus.
        
        double car = 4.00;
        double bus = 8.50;
        int passengersCar = 4;
        int passengersBus = 24;
        double averagePriceBus = bus/passengersBus;
        double averagePriceCar = car/passengersCar;
        System.out.println("The average price for car is " + averagePriceCar + " dollars.");
        System.out.println("The average price for bus is " + averagePriceBus + " dollars.");
        
        //3) Show me the result and remainder for integers 12 divided by 5.
        
        System.out.println("12 divided by 5 is " + 12/5);
        System.out.println("and the remainder is " + 12%5);
        
        //4) 5 friends are going to the movies to see Superman. The tickets are $16.39 each. 
        //Show me an expression which does the appropriate calculation for the total cost - 
        //but cast it finally to an int. Is this a good idea?
        
        //NO, this is not a good idea because it loses how many cents it would cost and only gives the dollar amount.
        int friends = 5;
        double ticketPrice = 16.39;
        double totalCost = friends * ticketPrice;
        System.out.println("Total ticket price is " + (int) totalCost + " dollars.");
        
        //5) Show me an expression that divides integer 3 by integer 5 - and casts the result to a float
        //to concatenate to the String Literal "Answer: " to show the full value. Is this possible? Is it a good idea? 
        //What would be the result without the cast?
        
        System.out.println("3/5 = " + (float) 3/5);
        // This is possible and a good idea because it gives a more specific answer and is not losing data.
        // The answer without the float would be 0.
    }
}
