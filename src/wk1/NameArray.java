/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk1;

import java.util.Scanner;
/**
 * Store info of 5 students in an array
 * @author User
 */
public class NameArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StudentData[] Student = new StudentData[5];
        
        for (int i = 0; i < Student.length; i++)
        {
            Student[i] = new StudentData();
            System.out.println("Please type the student ID:");
            Student[i].setID(input.nextInt()); 
            System.out.println("Please type the student Name:");
            Student[i].setName(input.next());
            System.out.println("Please type the student address:");
            Student[i].setAddress(input.next());
            System.out.println(Student[i].getID() + Student[i].getName() 
                    + Student[i].getAddress());
        }
        
        
        
    }
}
