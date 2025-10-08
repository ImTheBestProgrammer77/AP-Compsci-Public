/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringobjects;

/**
 *
 * @author AMoylan2026
 */
public class StringObjects {

   //Create a String object with the value being your first and last name. Each should begin with a capital letter.

//Investigate the String class, and use the demo examples I have shown to do the following. I am using my name as the example:

//Using the object variable you have created, print to the command line (and include the inner quotes) 'My name is "Paul Nelson" '
//Print 'My name length is 11"
//Print 'My name in upper case is "PAUL NELSON" '
//Print 'My name in lower case is "paul nelson" '
//Print 'The first letter in my name is "P" ' 
//Print 'The last letter in my name is "n" '
//Print "The index of the space between the names is 4"
    
    public static void main(String[] args) {
        //Using the object variable you have created, print to the command line (and include the inner quotes) 'My name is "Paul Nelson" '
        String myName = "Avery Moylan";
        System.out.println("My name is '" + myName + "'.");
//Print 'My name length is 11"
    System.out.println("My name is " + myName.length() + " characters long.");
//Print 'My name in upper case is "PAUL NELSON" '
    System.out.println("My name in uppercase is '" + myName.toUpperCase() + "'.");
//Print 'My name in lower case is "paul nelson" '
    System.out.println("My name in lowercase is '"+ myName.toLowerCase() + "'.");
//Print 'The first letter in my name is "P" ' 
    System.out.println("The first letter of my name is '" + myName.charAt(0) + "'.");
//Print 'The last letter in my name is "n" '
    System.out.println("The last letter of my name is '" + myName.charAt(myName.length() - 1) + "'.");
//Print "The index of the space between the names is 4"
    System.out.println("The index of the space between my names is " + myName.indexOf(" ") + ".");
        
        
    }
}
