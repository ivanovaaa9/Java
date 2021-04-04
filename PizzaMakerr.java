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
public class PizzaMakerr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What type of pizza: ");
        String pizzaType = s.next();
        
           System.out.println("How large(diameter): ");
        int pizzaDiameter = s.nextInt();
        
           System.out.println("How thick (in cm): ");
        int pizzaThickness = s.nextInt();
        
           System.out.println("Select topping #1: ");
        String topping1 = s.next();
        
           System.out.println("Select topping #2: ");
        String topping2 = s.next();
        
           System.out.println("How many slices: ");
        int slices = s.nextInt();
        
        System.out.printf("You've ordered a %d cm %s pizza,"
                + "%d cm thick, which has %s and %s."+
                "It will be cut into %d slices.\n", pizzaDiameter, pizzaType, 
                pizzaThickness, topping1, topping2, slices);
        
        double volume = Math.PI * Math.pow(pizzaDiameter / 2, 2)*
                pizzaThickness;
        
        System.out.printf("The volume of the pizza with radius %d and "
        + "height %d is %.2f cm3\n ", pizzaDiameter / 2, pizzaThickness, volume);
        
        
    }
    
}
