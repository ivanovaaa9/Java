/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Word: ");
      String word = s.next();
      
      char[] reverseWord = word.toCharArray();
      for(int i = reverseWord.length -1 ; i >= 0; i --){
          System.out.printf("%c", reverseWord[i]);
          
      }
      System.out.println("");
      
      
    }
    
}
