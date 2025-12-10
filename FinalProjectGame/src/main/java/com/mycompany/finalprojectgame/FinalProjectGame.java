/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalprojectgame;

/**
 *
 * @author AMoylan2026
 */

import java.util.*;

public class FinalProjectGame {

    public static void main(String[] args) {
        
        
        
        //set up variables and scanner/random number
        int max = 1;
        int number, pOne, pTwo;
        int diffOne = 0;
        int diffTwo = 0;
        Scanner scan = new Scanner(System.in);
        Random num = new Random();
        //String another = "y";
        //Scanner again = new Scanner(System.in);
        
        
        //intro at start of game only run at begining
        System.out.println("Welcome to Avery's number guessing game!");
        System.out.println();
        System.out.println("This is a two player game,"); 
        System.out.println("I will pick a number and whosever's guess is closest wins! ");
        
        
        
       //text instructions
        System.out.println();
        System.out.println("First, enter your desired maximum number");
        System.out.println("and I will pick a number between 0 and your number.");
        System.out.println("(Make sure you enter a whole number)");
        System.out.println();
        System.out.println("Enter it below:");
        
        
        if (scan.hasNextInt()){
        //getting max range number
        max = scan.nextInt();
       
        
        
        //generating a number between 0 and max number
        
         number = num.nextInt(max)+1;
        
         //System.out.println(number);
         System.out.println("I've got a whole number between 0 and " + max);
         System.out.println("Player #1 take your guess:");
        
         //get guesses from players
        if (scan.hasNextInt()){
         pOne = scan.nextInt();
         
         System.out.println("Player #2 take your guess:");
         
        if (scan.hasNextInt()){
         pTwo = scan.nextInt();
         
         //System.out.println(pOne);
         //System.out.println(pTwo);
         
         
         
         
         
         
         
        //get which guess is closer to number
        
        if (pOne < number){
            
            diffOne = number - pOne;
            //System.out.println("diff1 " +diffOne);
        }else{
            
            if(pOne > number){
                
            diffOne = pOne - number;
           // System.out.println("diff1 " +diffOne); 
            }else{
                if(pOne == number){
                    diffOne = 0;
                    //System.out.println("diff1 " +diffOne);
                }
            }
        }
        
        if (pTwo < number){
            
            diffTwo = number - pTwo;
            //System.out.println("diff2 " + diffTwo);
        }else{
            
            if(pTwo > number){
                
            diffTwo = pTwo - number;
            //System.out.println("diff2 " + diffTwo); 
            }else{
                if(pTwo == number){
                    diffTwo = 0;
                    //System.out.println("diff2 " + diffTwo);
                }
            }
        }
       System.out.println();
        //print out results
        if (diffTwo > diffOne){
            System.out.println("Player 1 WINS!");
        }else{
            System.out.println("Player 2 WINS!");
        }
        
        System.out.println("My number was " + number + ".");
        
        
        //try again? 
        /*System.out.println();
        System.out.println( "Do you want to try again? (y/n)" );
        
        another = again.next();*/
       
       System.out.println();
       System.out.println("Thanks for playing Avery's Number Guessing Game!");
       
       
       //pTwo is not a number
       }else{
        System.out.println();
        System.out.println("Invalid input...");
        System.out.println("Thanks for TRYING to play Avery's Number Guessing Game!");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Maybe next time Player #2 should TRY a whole number...");
        }
       
       
       //pOne is not a number
       }else{
        System.out.println();
        System.out.println("Invalid input...");
        System.out.println("Thanks for TRYING to play Avery's Number Guessing Game!");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Player #1 should know, I'm thinking of a WHOLE NUMBER, not... whatever that was.");
        }
       
       //max number not a number
      }else{
        System.out.println();
        System.out.println("Invalid input...");
        System.out.println("Thanks for TRYING to play Avery's Number Guessing Game!");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Pro tip: Desired Maximum Numbers tend to be, you know, WHOLE NUMBERS.");
        }
       
      
   
    
    //public static void   
    }
 
//public class    
}
