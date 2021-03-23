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
public class Contacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       int contacts;
       System.out.print("How many contacts do you have? ");
       contacts = s.nextInt();
       String[] names = new String [contacts];
       String [] numbers = new String [contacts];
       for (int i = 0; i < contacts; i++){
           System.out.print("Contacts # " + (i + 1) + "Name: ");
           String number = s.next();
           names[i] = number;
           System.out.print("Contacts # " + ( i + 1) + "Phone: ");
           String phone = s.next();
           numbers[i]= phone;
           
       }
       System.out.print("Search by name: ");
       String search = s.next();
       boolean found = false;
       for(int i = 0; i < contacts; i++){
           if(names[i].equalsIgnoreCase(search)){
               System.out.print("Found:" +  numbers[i]);
               found=true;
               break;
           }
           if(!found){
               System.out.print("Not found");
           }
           
           
       }
    }
    
}
