/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;


import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class BubbleSort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       String word;
       System.out.println("Word:");
       word=s.next();
    
        char[] wordAsArrayOfChars = word.toCharArray();
        
        Arrays.sort(wordAsArrayOfChars);
        String sortedString = new String(wordAsArrayOfChars);
       System.out.println(sortedString); 
        

      
    }}








