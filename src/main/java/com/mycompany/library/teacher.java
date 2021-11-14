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

public class teacher {
    
Scanner input = new Scanner(System.in);    
private String name;
private int classes;
private String subject;
public static int teacherCounter=0;
public teacher(){
    System.out.println("Enter Teacher Name : ");
    name = input.nextLine();
    System.out.println("Enter Teaching Subject : ");
    subject = input.nextLine();
    System.out.println("Enter Class Number : ");
    classes = input.nextInt();
   
    teacherCounter++;
}
   
public static void totalTeacher(){
    
    System.out.println("\n***************************************************\n");
    System.out.println("\nTotal Number Of Teachers Are : "+teacherCounter);
    System.out.println("\n***************************************************\n");
    
}

public  void show(){
    System.out.println("\n***************************************************\n");
    System.out.println("\nTEACHER NAME : "+this.name);
    System.out.println("\nTEACHING SUBJECT : "+this.subject);
    System.out.println("\nTEACHING CLASS : "+this.classes);
    System.out.println("\n***************************************************\n");
}

public void finalized(){
teacherCounter--;
    System.out.println("\n***************************************************\n");
    System.out.println("Teacher Deleted");
    this.show();
}

}