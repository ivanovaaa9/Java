/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Viktoria Tsvetanova
 */
public class BankDeposit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  p, r, t,p1,r1,t1,p2,r2,t2;
        double x;
       Scanner s = new Scanner(System.in);
        System.out.print("Amount: ");	
         x = s.nextDouble();
         double a = 0.5;
         double b = 0.9;
         double c = 1.5;
         double a1 = 0.6;
         double b1 = 1;
         double c1 = 1.8;
         double a2 = 0.8;
         double b2 = 1.2;
         double c2 = 2.2;
         p = (x/100)*a; 
         r = (x/100)*b;
         t = (x/100)*c;
         p1 = (x/100)*a1; 
         r1 = (x/100)*b1;
         t1 = (x/100)*c1;
         p2 = (x/100)*a2; 
         r2 = (x/100)*b2;
         t2 = (x/100)*c2;
         if (x >=100000){
         System.out.print(" 1 month - 0.8% - " + p2);
         System.out.print(" 1 year - 1.2% - " + r2);
         System.out.print(" 2 years - 2.2% - " + t2); }
         else if (x >= 1000 && x < 100000) {
         System.out.print(" 1 month - 0.6% - " + p1);
         System.out.print(" 1 year - 1% - " + r1);
         System.out.print(" 2 years - 1,8% - " + t1); }
         else if ( x > 0 && x < 1000){
         System.out.print(" 1 month - 0,5% - " + p);
         System.out.print(" 1 year - 0,9% - " + r);
         System.out.print(" 2 years - 1,5% - " + t);}
         else if (x<=0){
             System.out.print("Amount must be greater than zero");}
         
         
        
         
    }}