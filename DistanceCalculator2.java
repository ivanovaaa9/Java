/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class DistanceCalculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double speed, hours, distance;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your speed: ");
        speed = s.nextDouble();
        System.out.print("Enter your time: ");
        hours = s.nextDouble();
        
        distance = speed * hours;
        
        System.out.println("Distance: " + distance);
        
    }
    
}
