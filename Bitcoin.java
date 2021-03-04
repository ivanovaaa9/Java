/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class Bitcoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double buying;
        double price = 0;
        System.out.println("What's the current BUY price? ");
        buying = s.nextDouble();
        
        double selling;
        System.out.println("What's the current SELL price? ");
        selling = s.nextDouble();
        
        double amount;
        System.out.println("What amount do you want to trade? ");
        amount = s.nextDouble();
        
        if(amount<=0){
            System.out.println("You have to trade something! ");
            return;
        }
        
        String operation;
        
        System.out.println("What operation (BUY or SELL)? ");
        operation = s.next();
        if(!operation.equals("BUY")&& !operation.equals("SELL")){
            System.out.println("Unsupported operation ");
            return;
        }
        
        if (operation.equals("BUY")){
            price = amount * buying;
            System.out.printf("You've bought %.6f coins for %.2f leva\n",
                    amount,price);
        }else if(operation.equals("SELL")){
            price = amount * selling;
            System.out.printf("You've sold %.6f coins for %.2f leva\n",
                    amount,price);
        }
            
        
        }
        
    }
    

