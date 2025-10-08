/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car_class;

/**
 *
 * @author AMoylan2026
 */

/*Answer the following questions:

1) What is the difference between a class and an object?
    A class is a blueprint for objects and can make more than one object.

2) What happens when you pass an object to a print or println method?
    It prints out the value of the object.

3) What is the scope of a variable in a method? In a class?
    A class can represent a state in variables and a behavior in methods.

*/







/*4) Carry out the following programming project.

Write a class called Car that has 1 string variable called carBrand
An int variable called enginePower (in Horse Power)
A double variable called maxSpeed (in MPH)
A double variable called price (in $)

I suggest you start a control main method in the Main class, 
and use this to construct a single car object from the 
Car class as you go along, to help debug.

Write a constructor to produce a base car.

Write methods to set and get the brand, enginePower, as well as 
carSpeed and price

Write a toString method to print out these details.

Write a driver method in main to create car types VW Bug, 
Toyota Prius, BMW i8, Tesla Model 3, 
give them the enginePower and maxSpeed as you wish, 
and print these details out.*/





public class Car_class {

    public static void main(String[] args) {
        Car car1 = new Car("Prius", 500, 70, 14000.79);
        System.out.println(car1);
        Car car2 = new Car("VW Bug", 300, 100, 12000.84);
        System.out.println( "\n" + car2);
        Car car3 = new Car("BMW", 50000, 180, 84000.70);
        System.out.println("\n" + car3);
        Car car4 = new Car("Tesla", 300, 120, 70000.34);
        System.out.println( "\n" + car4);
    }
    
   /*Write a class called Car that has 1 string variable called carBrand
An int variable called enginePower (in Horse Power)
A double variable called maxSpeed (in MPH)
A double variable called price (in $) */
}
    class Car {
        private String carBrand = "";
        private int enginePower;
        private double maxSpeed;
        private double price;
        public Car(String inBrand, int inHP, double inSpeed, double inPrice){
            carBrand = inBrand;
            enginePower = inHP;
            maxSpeed = inSpeed;
            price = inPrice;
        }
        
        
        
        
        public String toString(){
            String myString = "My car brand is " + carBrand + "\n"
                    + "My engine power is " +  enginePower + " Horse Power" + "\n"
                    + "My max speed is " + maxSpeed + " MPH" + "\n"
                    + "The price was " + price + " dollars" ;
                   
            return myString;
            
        }
    }

