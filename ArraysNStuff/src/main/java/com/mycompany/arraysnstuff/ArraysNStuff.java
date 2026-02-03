/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysnstuff;

/**
 *
 * @author AMoylan2026
 */

import java.util.*;


public class ArraysNStuff {

    public static void main(String[] args) {
        
        
        
        final int WEEK = 7;
        String[] week = new String[WEEK];
        String[] temp;
        // Initialize the array values
       for (int i = 0; i < WEEK; i++){
            switch (i){
                case 0:
                    week[i] = "Monday";
                    break;
                case 1:
                    week[i] = "Tuesday";
                    break;
                case 2:
                    week[i] = "Wednesday";
                    break;
                case 3:
                    week[i] = "Thursday";
                    break;
                case 4:
                    week[i] = "Friday";
                    break;
                case 5:
                   week[i] = "Saturday";
                    break;
                case 6:
                    week[i] = "Sunday";
                    break;
                default:
                    week[i] = "Sunday";
            }
      
        }
       
            System.out.println("The days of the week are:");
       for (int index = 0; index <= week.length - 1; index++){
            System.out.print(week[index] + ", ");
    }  
    
        temp = new String[5];
        //now copy the current array into that
        for(int j = 0; j < 5; j++){
        temp[j] = week[j];
        }
        
        System.out.println();
        System.out.println("The school days are:");
       for (int index = 0; index <= temp.length - 1; index++){
            System.out.print(temp[index] + ", ");
        }  

    }
}

/*Write out an initialized array 
"weekDays" with all 7 days of the week. 
Print the days of the week out, one day per row. 
Now resize the array to 5, and copy just the weekdays 
(so not Saturday or Sunday) to it, and print the days again, 
one day per row. Comment your code where you are resizing it.*/

//For an extra bonus point, add a shuffling method, to change the order of the days randomly.