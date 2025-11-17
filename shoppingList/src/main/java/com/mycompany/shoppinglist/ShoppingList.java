/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;

import java.util.*;
/**
 *
 * @author AMoylan2026
 */
public class ShoppingList {

    public static void main(String[] args) {
        
        String item;
        String another = "y";
        int clear; 
        ArrayList<String> ShoppingList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        
        
        while (another.equalsIgnoreCase("y"))
     {
        System.out.println("Enter an Item to add to list:");
        item = scan.next();
        
        
        ShoppingList.add(item);
        
        System.out.println(ShoppingList);
        //System.out.println(ShoppingList.indexOf(item) + 1);
        
           System.out.println();
           System.out.println("Add another item? y/n");
           another = scan.next();
     }
        
        System.out.println("Would you like to remove any items? y/n");
        another = scan.next();
        while (another.equalsIgnoreCase("y"))
         {
            System.out.println("Enter number of item to remove:");
            clear = scan.nextInt();     
            ShoppingList.remove((clear-1));
            System.out.println(ShoppingList);
            
           System.out.println();
           System.out.println("Remove another item? y/n");
           another = scan.next();
         }
        
        System.out.println("Your Shopping List is:" + ShoppingList);
    }
}
