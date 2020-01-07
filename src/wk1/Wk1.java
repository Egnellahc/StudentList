/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk1;

/**
 *
 * @author User
 * 
 */

import java.util.Scanner;
public class Wk1 {

    /**
     * @param args the command line arguments
     * 
     * Build an algorithm within a main method that will take
       in a word, storing each character in the word in an
       Array. 
     * Your code should take in the word, store the
       word in an array and then iterate backwards over the
       array to print the word in reverse. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word you want to store");
        String sampleword = input.next();
        int numOfCharacters = sampleword.length();
        
        System.out.println("The character of the word '" + sampleword + "' placed in reverse order is below");
        for (int i = numOfCharacters - 1; i >= 0; i--){
            System.out.println(sampleword.charAt(i));
        }
        
    }
    
}
