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
public class SumIfLarger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int start;
       int sum = 0;
       int previous = 0;
       
       while(true) {
       System.out.println("Next: ");
       start = s.nextInt();
      if (start >= previous) {
          previous = start;
          sum += start;
          
      }else{
          break;
      }
       }
       System.out.println("Result:" + sum);
       
    }
    
}

       
    
        
    
    
    



