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
public class Hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 3;
    System.out.println("Side A is " + a);
    int b = 4;
    System.out.println("Side B is " + b);
    
    double c = Math.sqrt(a * a + b * b);
    System.out.println("The length of hypotenuse is " + c);
    
    
    }
    
}
