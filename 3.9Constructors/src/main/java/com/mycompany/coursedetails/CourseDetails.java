/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coursedetails;

/**
 *
 * @author AMoylan2026
 */


/*Write a class called Course that represents a course  offered to students. 

It should contain instance data that represents:
course title (e.g. Computer Science), 
course code (e,g, AP CS A), 
pointsTotal, 
course Instructor’s name. 

Define one Course constructor to accept and initialize all instance data.

Define a second constructor which accepts course name only.

Include Accessor (getter) and Mutator (setter) methods for all instance data. 

Include a toString method that returns a multi-line description of the course. 


Create a driver class called CourseDetails whose
main method instantiates and updates several Course objects (at least 3).

At least one course should be created using the full object constructor, 

one that uses the name only creator (but has the rest of it's values set by the setter and 
retrieved by getter methods).

The main method should then print out each course from the toString.*/


//set up driver class
public class CourseDetails {

    public static void main(String[] args) {
       
        //new course using full constructor
        Course class1 = new Course("AP Computer Science","AP CS A", 98 , "Mr. Nelson");
        System.out.println(class1);
       
        //new course using name only constructor
        Course class2 = new Course ("AP Calculus AB");
        class2.SetTeacher("Dr. Paye");
        class2.setCode("AP C AB");
        class2.setPoints(89.7);
        System.out.println(class2);
       
        //new course using empty constructor
        Course class3 = new Course();
        class3.setName("Catholic Faith 12");
        class3.SetTeacher("Mrs. Perry");
        class3.setCode("CF 12");
        class3.setPoints(100);
        System.out.println(class3);
    }
}
//set up course class
class Course {
    
     private String courseName = "";
     private String courseCode = "";
     private double pointsTotal;
     private String instructor = "";
        
        //full course constructor
        public Course(String inName, String inCode, double inPoints, String inTeacher){
            courseName = inName;
            courseCode = inCode;
            pointsTotal = inPoints;
            instructor = inTeacher;
        }
        
        
        //name only course constructor
        public Course(String inName){
            courseName = inName;
        }
        
        //empty course constructor
        public Course(){
            
        }
        
        //getters and setters
         
        public void setName(String inN){
      courseName = inN;
    }
         public void setCode (String inC){
      courseCode = inC;
    }
          public void setPoints(double inP){
      pointsTotal = inP;
    }
         public void SetTeacher (String inT){
      instructor = inT;
    }

        //to string
        public String toString(){
            String myString = "My course is " + courseName + "\n"
                    + "The course code is " +  courseCode + "\n"
                    + "My grade is " + pointsTotal  + "\n"
                    + "My teacher is " + instructor + "\n";
                   
            return myString;
            
        }
}
