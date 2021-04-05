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
public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 3;
        double b = 12.5;
        double c = 9;
        double x1 = (-b-Math.sqrt(b * b - 4 * a * c))/(2 * a);
        System.out.println("x1 = " + x1);
        
        double x2 = (-b+Math.sqrt(b * b - 4  * a * c))/(2 * a);
        System.out.println("x2 = " + x2);
        
        
        
    }
    
}
