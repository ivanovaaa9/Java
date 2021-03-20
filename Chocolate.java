/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Chocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int chocolate;
     double price = 1.00;
      System.out.println("Weight: ");
      chocolate = s.nextInt();
      if(chocolate < 25 || chocolate > 250) {
          System.out.println("Invalid weight value");
          return;
      }
      System.out.println("Type: ");
      String type = s.next();
      if(!type.equalsIgnoreCase("Milk") && !type.equalsIgnoreCase("Dark")){
          System.out.println("Milk or dark, please! ");
          return;
      }
      System.out.println("Cocoa percentage: ");
      double cacao= s.nextDouble();
      if( cacao < 0.45 || cacao > 0.99) {
          System.out.println("Cocoa must be between 0.45 and 0.99 ");
          return;
      }
      if(chocolate > 120){
          price += 0.75;
          System.out.printf("Chocolate price %.2f", price );
          return;
      }
      if(cacao > 0.70) {
          price += 0.40;
          System.out.printf("Chocolate price %.2f", price );
          return;
      }
      System.out.println("Chocolate price:" + price);
      
      
      
      
      
    }
    
}
