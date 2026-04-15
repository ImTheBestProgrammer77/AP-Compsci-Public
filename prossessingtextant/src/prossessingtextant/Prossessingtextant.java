/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prossessingtextant;

/**
 *
 * @author AMoylan2026
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;

public class Prossessingtextant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

String filePath = "text files/contacts.txt";
String outPath = "text files/output.txt";

String name = "";
String email = "";
String gradYear = "";
String username = "";

Scanner scan = new Scanner(System.in);

System.out.println("a for add contact details\n" +
"\n" +
"e for order by email address\n" +
"\n" +
"y for order by grad year\n" +
"\n" +
"n for order by name");

String func = scan.next();

Contact c1 = new Contact();

switch (func){
     case "a":
     System.out.print("Enter name (no space):");
     name = scan.next();
     System.out.print("Enter email:");
     email = scan.next();
    
     
System.out.print("Enter gradYear:");
gradYear = scan.next();
System.out.print("Enter username:");
username = scan.next();


c1.setInfo(name , email , gradYear, username);


String contentToWrite = c1 + "\n";
// Write to file
try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,
true))) {
//writer.write(contentToWrite);
writer.append(contentToWrite + "\n");
System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
System.err.println("An error occurred while writing to the file: " + e.getMessage());
}
// Read from file
try (BufferedReader reader = new BufferedReader(new
FileReader(outPath))) {
String line;
System.out.println("\nReading from the file:");
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
System.err.println("An error occurred while reading from the file: "
+ e.getMessage());
}
     break;
     case "e":
         System.out.println(c1.getEmail());
         break;
     case "y":
         System.out.println(c1.getGradYear());
         break;
     case "n":
         System.out.println(c1.getName());
         break;
     default:
     System.out.println("Thank You!");
            }
}
}







class Contact{
    
   private String name = "";
   private String email = "";
   private String gradYear = "";
   private String username = "";
   
   public Contact(){
       
   }
   public Contact(String n, String e, String y, String u){
       name = n;
       email = e;
       gradYear = y;
       username = u;
   }
   
   public String setInfo (String n, String e, String y, String u){
       name = n;
       email = e;
       gradYear = y;
       username = u;
       return name;
   }
   public String getEmail(){
       return email;
   }
   
   public String getGradYear(){
       return gradYear;
   }

   public String getName(){
       return name;
   }

   
   public String toString (){
       String result = "";
       result = "Info: " + name + ", " + email + ", " + gradYear + ", " + username;
       return result;
   }
}