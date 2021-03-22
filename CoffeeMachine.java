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
public class CoffeeMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
      double amount, shortEx, longEx, capp, coffeWm, caffeineFree;
      String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3. "
              + "cappuccino\t0.85\n4. coffe with milk \t0.90\n5. "
              + "caffeine-free\t0.60\n";  
      shortEx = 0.50;
      longEx = 0.60;
      capp = 0.85;
      coffeWm = 0.90;
      caffeineFree = 0.60;
      
      System.out.println("Amount:" );
       amount = s.nextDouble();
       System.out.println("Your choice: ");
        menu = s.next();
      
        switch(menu){
           case "1":
               if(amount == shortEx){
               System.out.printf("Preparing your drink...");
               break;
               }else if (amount > shortEx){
              System.out.printf("Preparing your drink...\nChange: %,.2f\n", 
                      amount - shortEx);
                   break;
        }else { System.out.println("Not enough money");
        break;}
        
           case "2":
               if(amount == longEx){
               System.out.printf("Preparing your drink...");
               break;
               }else if (amount > longEx){
                   System.out.printf("Preparing your drink...\nChange: %,.2f\n",
                 amount - longEx);
                   break;
                   }else { System.out.println("Not enough money");
        break;}
                   
           case "3":
               if(amount == capp){
               System.out.printf("Preparing your drink...");
               break;
               }else if (amount > capp){
                   System.out.printf("Preparing your drink...\nChange: %,.2f\n", 
                       amount - capp);
                   break;
                   }else { System.out.println("Not enough money");
        break;}
               
           case "4":
               if(amount == coffeWm){
               System.out.printf("Preparing your drink...");
               break;
               }else if (amount > coffeWm){
                   System.out.printf("Preparing your drink...\nChange: %,.2f\n", 
                       amount - coffeWm);
                   break;
               }else { System.out.println("Not enough money");
        break;}
           case "5":
               if(amount == caffeineFree){
               System.out.printf("Preparing your drink...");
               break;
               }else if (amount > caffeineFree){
                   System.out.printf("Preparing your drink...\nChange: %,.2f\n", 
                       amount - caffeineFree);
                   break;
                   }else { System.out.println("Not enough money");
        break;}
               default:
               System.out.println("Please select from the menu!");
        break;
        }
        
    }
}

               
       
    
       
       
      
      
      
    



    

