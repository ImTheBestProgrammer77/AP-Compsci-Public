/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stars;

/**
 *
 * @author AMoylan2026
 */
public class Stars {

    
  /*  
    Hint: Parts b, c, and d require several loops, some of which
print a specific number of spaces.
a. 
**********
*********
********
*******
******
*****
****
***
**
*
    
b.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

 
c. 
********** 
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
    
d.
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    */
    
    
    public static void main(String[] args) {
        
        //set up variables
        final int MAX_ROWS = 10;
        final int MIN_ROWS = 0;
        final int MAX_ROWS_D = 4;
        final int MAX_ROWS_D2 = 4;
        
        System.out.println("a.");
        //for loop for a.
        for (int row = 10; row >= MIN_ROWS; row--)
       {
            //print out right amoutn of stars
            for(int star = 1; star <= row; star++)
            {
                System.out.print("*");
            }
            
            //new row
            System.out.println();
        }
        
         System.out.println("b.");
        //loop for b.
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            //spaces
            for (int space = 10; space >= row; space--)
            {
                System.out.print(" ");
            }
            //stars
            for(int star = 1; star <= row; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("c.");
        //loop for c.
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            //spaces
            for (int space = 0; space <= row; space++)
            {
                System.out.print(" ");
            }
            //stars
            for(int star = 10; star >= row; star--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("d.");
        //d
        
         
            
        System.out.println("      *");
        for (int row = 1; row <= MAX_ROWS_D; row++)
        {
            
            
            //spaces
            for (int space = 5; space >= row; space--)
            {
                System.out.print(" ");
            }
            //stars
            for(int star = 1; star <= row; star++)
            {
                System.out.print("***");
            }
            System.out.println();
        }
        for (int row = 1; row <= MAX_ROWS_D2; row++)
        {
            //spaces
            for (int space = 0; space <= row; space++)
            {
                System.out.print(" ");
            }
            //stars
            for(int star = 4; star >= row; star--)
            {
                System.out.print("***");
            }
            System.out.println();
            
        }
        System.out.println("      *");
    }
    
}
