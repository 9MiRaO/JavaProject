/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author 9MiRaO
 */
public class main {
    public static void main(String[] args) {
        int choice;
       List<teacher> teacherList = new ArrayList<>();
       List<student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("*******Welcome to School Database *****");
        do {
            
            System.out.println("\tPress 1 to Add\n");
            System.out.println("\tPress 2 See Total Number\n");
            System.out.println("\tPress 3 to Delete\n");
            System.out.println("\tPress 4 Show Records\n");
            System.out.println("\tPress 5 to Quit the program\n");
            choice = input.nextInt();
        
            switch(choice){
              
                case 1: 
                {   
                    System.out.println("Press 1 To Add Teacher ");
                    System.out.println("Press 2 to Add Student");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:{
                        teacherList.add(new teacher());
                            break;
                        }
                        case 2:{
                            studentList.add(new student());
                            break;
                        }
                        default:
                        {
                            System.out.println("Invalid option : Try Again ");
                                
                        }
                        }
                    break;
                    }
                    
                    
                 
                case 2:
                {
                     System.out.println("Press 1 to See Total Teachers ");
                    System.out.println("Press 2 to See Total Students");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:{
                        teacher.totalTeacher();
                            break;
                        }
                        case 2:{
                            student.totalStudent();
                            break;
                        }
                         default:
                         {
                             System.out.println("Invalid option : Try Again ");
                         }
                }
                    break;
                }
              case 3:
                {
                     System.out.println("Press 1 to Delete Teacher ");
                    System.out.println("Press 2 to Delete Students");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:{
                         int i=0;
                              for(teacher t:teacherList){
                        System.out.println("\n***************************************************\n");
                        System.out.println("\n    Teacher ID : "+i++);
                         t.show();
              }
                     System.out.println("Enter Teacher Id to Delete ");
                     int id = input.nextInt();
                     teacherList.get(id).finalized();
                     teacherList.remove(id);
                  break;
                        }
                        case 2:{
                            int i=0;
                               for(student s:studentList){
                       System.out.println("\n***************************************************\n");
                         System.out.println("\n   Student ID : "+i++);
                         s.show();
              }
                     System.out.println("Enter Student ID to Delete ");
                     int id = input.nextInt();
                     studentList.get(id).finalized();
                     studentList.remove(id);
                  break;
                            
                        }
                         default:
                         {
                             System.out.println("Invalid option : Try Again ");
                         }
                }
                        break;
                }
              case 4:{
                  
                   System.out.println("Press 1 to See All  Teacher's Records ");
                    System.out.println("Press 2 to See All Student's Records");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:{
                        for(teacher t:teacherList){
                        
                         t.show();
                                                  } 
                            break;
                                }
                        case 2:{
                            for(student s:studentList){
                         s.show();
                            }
                            break;
                        }   
                         default:
                         {
                             System.out.println("Invalid option : Try Again ");
                         
                         }
                  
              }
              break;
              }
               default:
               {
                   System.out.println("Invalid option : Try Again ");
               }
            }
            
        }while(choice!=5);
    }
}

