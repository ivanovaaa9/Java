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
public class ReverseSentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = s.nextLine();
        String[] words = sentence.split(" ");
        
        System.out.println("Original order: ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Reverse sentence: ");
        
        for (int i = words.length-1; i > 0; i--) {
            System.out.print(words[i] + " ");
            
        }
        for (int i = 0; i < 1; i++) {
            System.out.print(words[0]);
            System.out.println("");
        }
        
    }
    
}
    
    
            
   
