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
public class Hypotenuse3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double a, b, c;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a: ");
        a =  s.nextDouble();
        
        if(a <= 0) {
        System.out.println("The side A cannot be less or equal to zero");
        return;
        }
      System.out.println("Enter b: ");
        b =  s.nextDouble();
        
           if (b <= 0){
       System.out.println("The side B cannot be less than or equal to zero");
       return;
           }
     
           
        
      if(a == b) {
         System.out.println("This is an isosceles triangle");
           c = Math.sqrt(a * a + b * b);
      }
         c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      System.out.printf("The length is %.2f\n", c);
                
               {
               
               
               
           }
    }
    
       }
        
        
        
    
