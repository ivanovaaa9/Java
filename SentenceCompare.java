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
public class SentenceCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("First sentence: ");
       String firstSentence = s.nextLine();
       String [] word1 = firstSentence.split(" ");
       
       System.out.println("Second sentence: ");
       String secondSentence = s.nextLine();
       String [] word2 = secondSentence.split(" ");
       
       System.out.println("Third sentence:");
       String thirdSentence = s.nextLine();
       String [] word3 = thirdSentence.split(" ");
       
       for (int i = 0 ; i < word1.length; i++){
           for(int j = 0; j < word2.length; j++){
               for(int k = 0; k < word3.length;k++){
               
                   
                 if(word1[i].equalsIgnoreCase(word2[j]) && 
                         word1[i].equalsIgnoreCase(word3[k])){
                     System.out.printf("The word %s is in " + 
                             "all three sentences.\n", word1[i]);
                 }
               }
           }
       }
         
  for (int i = 0 ; i < word1.length; i++){
           for(int j = 0; j < word2.length; j++){
               for(int k = 0; k < word3.length;k++){  
                   
                   if(!word1[i].equalsIgnoreCase(word2[j]) &&
                           !word1[i].equalsIgnoreCase(word3[k])){
                       System.out.println("No match");
                   }
               }
           }
  }
    }
}

       
       
       
    

    

