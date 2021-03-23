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
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int [] x = new int [7];
       for(int i = 0; i < x.length; i++){
           x[i] = s.nextInt();
           
       }
       int positive = 0, negative = 0, zeroes = 0;
       for(int i = 0; i < x.length; i++){
           if(x[i] > 0){
               positive++;
               
           }else{
               zeroes++;
           }
       }
       System.out.printf("Positive: %d\n", positive);
       System.out.printf("Negative: %d\n", negative);
       System.out.printf("Zeroes: %d\n", zeroes);
    }
    
}
