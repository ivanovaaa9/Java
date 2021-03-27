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
public class DistanceCalculator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double speed;
        
        System.out.println("Speed in km is: ");
        speed = s.nextDouble();
          
        if(speed <=0){
            System.out.println("Invalid speed!");
            return;
            
        }
        if(speed>140) {
            System.out.println("Slow down, please! ");
            return;
        }
        double minutes;
        System.out.println("Duration in minutes: ");
        minutes= s.nextDouble();
      
        if(minutes<=0) {
            System.out.println("Invalid diration! ");
            return;
        }
        if(minutes > 480){
            System.out.println("You need some rest.");
            
        }
        else{
            double distance;
            distance = speed*(minutes/60);
            System.out.printf("Distance:%,.1f km\n", distance);
        }
    }
    
}
