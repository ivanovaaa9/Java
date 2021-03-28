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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0,y = 1,z,l;
         System.out.println("Limit: "   );
         l = s.nextInt ();
        
         System.out.println(x);
         System.out.println(y);
           
         
         for(int i = 0; i < l - 2; i++) {
    z = x + y;
    x=y;
    y=z;
    
        System.out.println(z);
         }
       
         
    }
    
}


