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
public class CardioCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        double w;
        double h;
        double m;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Age: ");
        a = s.nextDouble();
        System.out.println("Weight: ");
        w = s.nextDouble();
        System.out.println("Hearth rate: ");
        h = s.nextDouble();
        System.out.println("Duration in minutes");
        m = s.nextDouble();
        
        double e = (a * 0.2017 - w * 0.19872 + h * 0.6309 - 55.0969) * m / 4.184;
        System.out.println("Result: " + e);
        
        
        
    }
    
}
