/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miles;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Miles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        double from, to;
        System.out.println("From: ");
        from = s.nextDouble();
        System.out.println("To: ");
        to = s.nextDouble();
       
        if(from > to){
            System.out.println("Lower bound greater than the upper bound ");
            return;
        }System.out.println("Steps:");
        double steps = s.nextDouble();
        if(steps < 0.2 || steps > 5) {
            System.out.println("Incompatable steps");
            return;
        }
        double mlTokm = 1.6093;
        
        
    }
    
}
