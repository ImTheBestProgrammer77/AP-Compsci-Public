/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.more_arrays;

/**
 *
 * @author AMoylan2026
 */

import java.util.*;

/*Write a 2D String array called deckOfCards. 
This will have 4 arrays, each of length 13. 
Fill the 4 arrays with the 4 suits of playing cards, 
from Ace to King (1 to 13). Shuffle the deck, and deal out 
4 hands of 5 cards from this 2D array 
(no dealing the same card twice). 
Show the hands (Diamonds, Hearts, Clubs, Spades).*/

public class More_arrays {

    public static void main(String[] args) {
        
        //new deck of cards with no values
        int[][] deck = new int[4][13];
        //to randomly select cards
        Random num = new Random();
         int SUIT = 4;
         int VALUE = 13;
         
        // add values
        for (int suit=0; suit < deck.length; suit++){
            for (int val=0; val< deck[suit].length; val++)
                deck[suit][val] = val + 1;
        }
        
        //print out whole deck
        System.out.println("Your Deck of Cards is:");
        for (int suit=0; suit < deck.length; suit++){
            for (int val = 0; val < deck[suit].length; val++){
                switch (suit){
                    case 0:
                        System.out.print(deck[suit][val] + " of hearts" + "\t");
                        break;
                    case 1:
                        System.out.print(deck[suit][val] + " of spades" + "\t");
                        break;
                    case 2:
                        System.out.print(deck[suit][val] + " of diamonds" + "\t");
                        break;
                    case 3:
                        System.out.print(deck[suit][val] + " of clubs" + "\t");
                        break;
                    default:
                        System.out.print("cards");
                }

                
            }System.out.println();
        }
        //1st hand
        System.out.println();
        System.out.println("1st hand of cards is:");
        
        for (int i=0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
        
         
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] + " of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
                }
         }
        
        System.out.println();
        System.out.println();
        System.out.println("2nd hand of cards is:");
        
        for (int i=0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
        
         
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] + " of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
                }
         }
        
        System.out.println();
        System.out.println();
        System.out.println("3rd hand of cards is:");
        
        for (int i=0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
        
         
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] + " of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
                }
         }
        System.out.println();
        System.out.println();
        System.out.println("4th hand of cards is:");
        
        for (int i=0; i < 5; i++){
            int one = num.nextInt(SUIT);
            int two = num.nextInt(VALUE);
        
         
            switch (one){
                case 0:
                    System.out.print(deck[one][two] + " of hearts" + "\t");
                    break;
                case 1:
                    System.out.print(deck[one][two] + " of spades" + "\t");
                    break;
                case 2:
                    System.out.print(deck[one][two] + " of diamonds" + "\t");
                    break;
                case 3:
                    System.out.print(deck[one][two] + " of clubs" + "\t");
                    break;
                default:
                    System.out.print("cards");
                }
        }
    }
}
