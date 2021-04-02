/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     int [] myNums = new int [6];
     int [] randomNums = new int [6];
     
     System.out.println("Enter 6 numbers: ");
     for(int i = 0; i < myNums.length; i++){
         myNums[i] = s.nextInt();
         if(myNums[i] < 1 || myNums[i] > 47){
             System.out.println("Only between 1 and 47!");
             i--;}
         
         }System.out.println("Lotto number: ");
         Random r = new Random();
        for(int i = 0; i < randomNums.length;i++){
            randomNums[i]= r.nextInt(46)+1;
            System.out.printf("%d\t",randomNums[i]);
     }
        System.out.println();
        int matches = 0;
        for(int i = 0; i < myNums.length; i++){
     for(int j = 0; j < randomNums.length; j++){
        if(myNums[i] == randomNums[j]){
            matches++;
        } 
     }


    }
        System.out.printf("You have guessed %d numbers !\n", matches);
    
}}


