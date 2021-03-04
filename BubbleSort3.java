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
public class BubbleSort3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       String temp;
       System.out.println("Sentence:");
       String sentence = s.nextLine();
       String[] words = sentence.split(" ");
       
      for(int i = 0; i < words.length; i++) {
          for(int j = i + 1; j <words.length;j++){
              if(words[i].compareToIgnoreCase(words[j])> 0) {
               temp=words[i];
               words[i]=words[j];
               words[j]=temp;
              }
          }
      } 
     for(int i = 0; i < words.length - 1;i++) {
         System.out.print(words[i] + " ");
     }
       System.out.println(words[words.length - 1]);
       
    }
    
}
