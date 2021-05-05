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
public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r;
        Scanner s = new Scanner(System.in);
        System.out.println("Diameter of the sphere is: ");
        r = s.nextDouble();
        
        double volume = (4 / 3) * Math.PI * (r * r * r);
        double surface = 4 * Math.PI * (r * r);
        
        System.out.printf("The volume of the sphere with diameter %,.2f "
                + "is %.4f\n", r, volume );
        System.out.printf("The surface area is%.4f\n", surface);
        
    }
    
}
