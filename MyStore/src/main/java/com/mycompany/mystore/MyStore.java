/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystore;

import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 *
 * @author AMoylan2026
 */


//Write a program (project) called "MyStore"
//After the public Class MyStore, add another class called "Item"
//Give the Item Class variables strName and dblPrice.

//Items: T Shirt - 29.99, Shoes - 125.99, Jeans - 60.99, Jacket - 250.00, Hat - 25.99, Shorts - 75.99, Blouse - 88.99

//Create a toString method that return the name and price (e.g. "Item: Shoes, Price: 125.99")
//Add getters and setters to set/return both variables

//in the MyStore controlling main method, set a colnstant variable MAX_BUDGET to $250.00
//Ask the user to enter items. If they enter "T Shirt" or whatever, 
//get the price for that item. Add each item's price to a total, and increment a count.
//After each entry, let them know the count and how much they've spent so far. 
//Set conditional statements so that they cannot go over budget (give a warning if they go over budget).
//You can use a while(true) loop for this.

public class MyStore {

    public static void main(String[] args) {
       
        //set up  budget variables/constant 
        final double MAX_BUDGET = 250.00;
        double priceTotal = 0;
        Scanner scan = new Scanner(System.in);
        String itemIn;
       System.out.println("Enter item to purchase");
       while( priceTotal <= MAX_BUDGET){
           
           itemIn = scan.next();
           
           Item thing1 = new Item( itemIn);
           System.out.println(thing1);
           
           
           
           priceTotal = priceTotal + 80;
       }
       System.out.println("You are over budget");
    }
}

class Item {
    
    //Items: T Shirt - 29.99, Shoes - 125.99, Jeans - 60.99, Jacket - 250.00, Hat - 25.99, Shorts - 75.99, Blouse - 88.99
   /* private double tShirt = 29.99;
    private double shoes = 125.99;
    private double jeans = 60.99;
    private double jacket = 250.00;
    private double hat = 25.99;
    private double shorts = 75.99;
    private double blouse = 88.99;*/
    private String itemName = "";
    private double price;
    
     public Item(String inName){
            itemName = inName;
           
            switch (inName){
                case "T shirt":
                    price = 29.99;
                    break;
                case "Shoes":
                    price = 125.99;
                    break;
                case "Jeans":
                    price = 60.99;
                    break;
                case "Jacket":
                    price = 250.00;
                    break;
                case "Hat":
                    price = 25.99;
                    break;
                case "Shorts":
                    price = 75.99;
                    break;
                case "Blouse":
                    price = 88.99;
                    break;
                default:
                    price = 0;
            }
        }
     public void FindPrice(){
    
}
     public double price (){
         double printPrice = price;
            
         return printPrice;
     }
             
     //to string
        public String toString(){
            String myString = "My item is " + itemName + "\n"
                    + "The total price is " +  price ;
                   
                   
            return myString;
            
        }
}