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
public class ConeVolume2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius, height, volume;
        
        System.out.println("Enter the radius: ");
        radius = s.nextDouble();
        if(radius <= 0) {
          System.out.println("Radius must be larger > 0! ");
          return;
        }
        System.out.println("Enter the height: ");
        height = s.nextDouble();
        if(height <= 0) {
            System.out.println("The height must be > 0! ");
            return;
        }
        volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.printf("The volume of the cone is: %.2f\n", volume);
        
    }
    
    
}
