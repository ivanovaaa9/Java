/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author user
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v1 = 78.2;
        double t1 = 1.5;
        double distance1 = v1 * t1;
        System.out.println("Distance 1 :" + distance1 +"km.");
        
        double v2 = 85.54;
        double t2 = 2.25;
        double distance2 = v2 * t2;
        System.out.println("Distance 2 :" + distance2 + "km.");
        
        double v3 = 90;
        double t3 = 3.2333333333333333;
        double distance3 = v3 * t3;
        System.out.println("Distance 3 :" + distance3 + "km.");
    }
    
}
