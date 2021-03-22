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
public class ConeVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int r, h;
    Scanner s = new Scanner (System.in);
    
    System.out.println("Enter the radius: ");
    r = s.nextInt();
    System.out.println("Enter the height: ");
    h = s.nextInt();
    
    double V =Math.PI * r * r * h / 3;
    System.out.println("The volume of the cone is: " + V);
    }
    
}
