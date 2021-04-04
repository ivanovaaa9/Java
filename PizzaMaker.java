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
public class PizzaMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       double price = 5;
       System.out.println("What type of pizza do you want? ");
       String pizza = s.next();
       
       if (!pizza.equalsIgnoreCase("PEPPERONI") && 
               !pizza.equalsIgnoreCase("SICILIANA")) {
           System.out.println("We cannot cook such pizza");
           return;
       }
       System.out.println("How large (diamter in cm)");
       int diameter = s.nextInt();
       if(diameter < 12 || diameter > 36) {
           System.out.println("We only make pizzas between 12 and 36 cm.");
          return;
       }
       price += diameter / 12;
       System.out.println("How thick (in cm)?");
       int thickness = s.nextInt();
       if(thickness < 1){
        System.out.println("The pizza is too thin!");
        return;
       }else if (thickness > 4){
        System.out.println("The pizza is too thick!");
        return;
       }
       price += thickness / 2;
      
       System.out.println("Select topping #1: ");
       String topping1 = s.next();
       switch(topping1) {
           case "ketchup":
               price += 0.20;
               break;
           case "mustard":
               price += 0.23;
               break;
           default:
               price += 0.27;
               break;
       }
       System.out.println("Select topping#2: ");
       String topping2 = s.next();
       switch(topping2) {
           case "ketchup":
               price += 0.20;
               break;
           case "mustard":
               price += 0.23;
               break;
           default:
               price += 0.27;
               break;
       }
       System.out.println("How many slices");
       int slices = s.nextInt();
       if(slices < 0) {
           System.out.println("No way to slice the pizza!");
           return;
       } else if (slices == 0) {
           System.out.println("We will not slice the pizza!" );
       } else if( slices > 16) {
           System.out.println("We cannot make more than 16 slices! ");
           return;
       }
       System.out.printf("You ordered a %d cm %s pizza,%d thick, "
       + "which has %s and %s.It will be cut in %d slices.\n",diameter, pizza, 
       thickness, topping1, topping2, slices);
        double volume = Math.PI * Math.pow(diameter / 2, 2) * thickness;
        System.out.printf("The volume of the pizza with radius %d and "
        + "height %d is %.2f cm3.\n ", diameter / 2, thickness, volume );
        
        System.out.printf("The final price is: %.2f\n", price);
        
           
           
       }
       
       
       
       
       
       
       
       
    }
    

