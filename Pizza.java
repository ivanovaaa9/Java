/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       
       double v;
    
       System.out.println("Thickness: ");
       double a = s.nextDouble();
       System.out.println("Radius: ");
       double z = s.nextDouble();
          v = (Math.PI * (z * z) * a);
       System.out.println("The volume of the pizza is:"+ v);
       
    }
    
}
