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
public class LongWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
        System.out.println("How many words? ");
        int words = s.nextInt();
        System.out.printf("Please enter %d words:", words);
        String [] sortWords = new String[words];
        
        for(int i = 0;i < sortWords.length; i++){
            String h = s.next();
            sortWords[i] = h;
        }
        System.out.print("Display words longer than:");
        int size = s.nextInt();
        
        for (int i=0; i < sortWords.length; i++){
            if(sortWords[i].length() > size){
                System.out.println(sortWords[i]);
                
            }
        }
        
  
    
}
}

