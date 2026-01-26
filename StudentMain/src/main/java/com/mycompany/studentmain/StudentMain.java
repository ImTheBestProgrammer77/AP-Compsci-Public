/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmain;

/**
 *
 * @author AMoylan2026
 */
import java.util.*;
       


//public class
public class StudentMain{
    
public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    
    String first, last;
    
    System.out.println("Enter Student's first name:");
    first = scan.next();
    System.out.println("Enter Student's last name: ");
    last = scan.next();

    Student st1 = new Student(first, last);

    System.out.println();
    System.out.println();
    System.out.println("Student Records");
    System.out.print("Student: ");
    System.out.println(st1);
    System.out.println("Student Average is " + st1.getAverage());
}

}


//basic class Student - should have 3 courses
class Student{
    
    private String firstName, lastName;
    public int average;
   
    //empty constructor to create empty Student object
    public Student(){
        firstName = "";
        lastName = "";
    }
    //basic constructor to create Student object with name only
    public Student(String first, String last){
        firstName = first;
        lastName = last;
    }
    
    //needs a constructor to include 3 course objects
    Course calc = new Course("Calculus");
    Course eng = new Course("English");
    Course phys = new Course("Physics");
    
    //setScores
    int ca = calc.setScore(86);
    int en = eng.setScore(98);
    int ph = phys.setScore(72);
    
    
    //get average
    public int getAverage(){
       average = (ca + en + ph )/ 3;
       return average;
    }
    
    
    //basic toString code
    public String toString(){
    String result;
        result = firstName + " " + lastName + "\n"
                + calc + " " + eng +  " " + phys;
        return result;
    }
}


//basic class Course
class Course{
    public int score = 0;
    String name = "";
   
    public Course(String courseName){
        name = courseName;
    } 
    
    public int setScore(int inScore){
        score = inScore;
        return score;
    }
    
    public int getScore(){
        return score;
    }
    

    
    //to string code
     public String toString(){
    String result;
        result = name + ":" + score;
        return result;
     }
}