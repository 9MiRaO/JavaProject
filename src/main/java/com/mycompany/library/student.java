/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;
import java.util.Scanner;
/**
 *
 * @author 9MiRaO
 */

public class student {
    
Scanner input = new Scanner(System.in);    
private String name;
private int classes;
public static int studentCounter=0;
public student(){
    System.out.println("Enter Student Name : ");
    name = input.nextLine();
    System.out.println("Enter Student Class : ");
    classes = input.nextInt();
   
    studentCounter++;
}
   
public static void totalStudent(){
    
    System.out.println("\n***************************************************\n");
    System.out.println("\nTotal Number Of Students Are : "+studentCounter);
    System.out.println("\n***************************************************\n");
    
}

public  void show(){
    System.out.println("\n***************************************************\n");
    System.out.println("\nStudent NAME : "+this.name);
    System.out.println("\nStudent CLASS : "+this.classes);
    System.out.println("\n***************************************************\n");

}

public void finalized(){
studentCounter--;
System.out.println("\n***************************************************\n");
    System.out.println("Student Deleted");
    this.show();
}

}