/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author VickyDanny
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp;
 	  	
         int unit;
 	  	
         Scanner s = new Scanner(System.in);
 	  	
         System.out.print("Temperature: ");
 	  	
         temp = s.nextDouble();
	  	
         System.out.print("Unit: ");
 	  	
         unit = s.nextInt();
 	  	
         
 	  	
         double c, f ,k;
 	  	
         if(unit == 1) {
 	  	
             c = temp;
 	  	
             f = (9.0 / 5) * c + 32;
 	  	
             k = c + 273.15;
 	  	
             System.out.println("Fahrenheit: " + f);
 	  	
             System.out.println("Kelvin: " + k);           
 	  	
         }
 	  	
         else if(unit == 2) {
 	  	
             f = temp;
 	  	
             c = (5.0 /9) * (f -32);
 	  	
             k = c + 273.15;
 	  	
             System.out.println("Celsius: " + c);
 	  	
             System.out.println("Kelvin: " + k);
 	  	
         }
 	  	
         else if(unit == 3) {
 	  	
             k = temp;
 	  	
             c = k - 273.15;
 	  	
             f = (9.0 / 5) * c + 32;
 	  	
             System.out.println("Celsius: " + c);
 	  	
             System.out.println("Fahrenheit: " + f);
 	  	
             
 	  	
         }
 	  	
         else {
 	  	
             System.out.println("Unsupported unit");         
 	  	
         }
 	  	
     
 	  	
     
 	  	
     
 	  	
