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
public class ArrayCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String[] firstArray, secondArray, matches;
       
       System.out.println("How many in the first array? ");
       int array1 = s.nextInt();
       System.out.println("How many in the second array? ");
       int array2 = s.nextInt();
       
       firstArray = new String[array1];
       for( int i = 0; i < array1; i++){
           System.out.print("1st array number: ");
           firstArray[i] = s.next();
           
       }
       secondArray = new String[array2];
       for(int j = 0; j < array2; j++){
           System.out.print("2nd array number: ");
           secondArray[j] = s.next();
           
       }
       matches = new String [(array1<array2 ? array1 : array2)];
       int matchCounter = 0;
       
       for( int i = 0; i < array1; i++){
        for(int j = 0; j < array2; j++){
            if((firstArray[i]).equals(secondArray[j])){
               System.out.printf("Match: " + firstArray[i]);
            }
        }       
       
    }
    
    }
}

