/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiuscalc;

/**
 *
 * @author AMoylan2026
 */


import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations on circular items
    //such as a circle, a sphere, a cone, a column
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        if (i == 1){
            cirCalc();
        }else if (i == 2){
            sCalc();
        }else if(i == 3){
            conCalc();
        }else if(i == 4){
            colCalc();
        }
    }
    
    public static void colCalc(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your column");
        int r = s.nextInt();
        System.out.println("enter the height of your column");
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }
    
    public static void conCalc(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your cone");
        int r = s.nextInt();
        System.out.println("enter the height of your cone");
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h/3;
        System.out.println(result);
    }
    
      public static void sCalc(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your sphere");
        int r = s.nextInt();
        double result = (4/3) * Math.PI * Math.pow(r, 3);
        System.out.println(result);
    }  
      
    public static void cirCalc(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of your circle");
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        System.out.println(result);
    }
    

}