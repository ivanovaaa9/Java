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
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int amount;
      double usdTobgn=1.72;
      double eurTobgn=1.9558;
      String from, to;
     System.out.println("Amount: ");
     amount = s.nextInt();
     
     System.out.println("From: ");
     from = s.next();
     System.out.println("To: ");
     to = s.next();
    
     double result = 0;
     if(from.equals(to)) {
         result = amount;
     }else if (from.equals("USD") && to.equals("BGN")){
         result = amount * usdTobgn;
     }else if (from.equals("BGN") && to.equals("USD")) {
         result = amount / usdTobgn;
     }else if(from.equals("EUR") && to.equals("BGN")) {
         result = amount * eurTobgn;
     }else if(to.equals("BGN") && from.equals("EUR")) {
         result = amount / eurTobgn;
     }else if (to.equals("USD") && from.equals("EUR")) {
         result = amount * usdTobgn / eurTobgn;
     }else if (to.equals("EUR") && from.equals ("USD")) {
         result = amount * eurTobgn / usdTobgn;
     } else {
         System.out.println("Unknown conversion");
         return;
     }
     System.out.printf("Result: %.4f\n", result);
     
     
     
    }
    
}
