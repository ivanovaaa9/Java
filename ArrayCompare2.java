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
public class ArrayCompare2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       
       
       System.out.println("How many in the first array? ");
       int array1 = s.nextInt();
       double [] firstArray = new double[array1];
     
       System.out.println("How many in the second array? ");
       int array2 = s.nextInt();
       String [] secondArray = new String[array2];
       
      
       for( int i = 0; i < array1; i++){
          
           System.out.print("1st array number: ");
           firstArray[i] = s.nextDouble();
           
           
       }
  
       for(int j = 0; j < array2; j++){
           System.out.print("2nd array number: ");
           secondArray[j] = s.next();
           
       }
       for( int i = 0; i < array1; i++){
        for(int j = 0; j < array2; j++){
            int x = (int)firstArray[i];
            
            int y = Integer.parseInt(secondArray[j]);
            
            if (x == y){
              
               System.out.printf("Match: " + firstArray[i]);
            }
        }       
       
    }
    
    }
}

    
    

