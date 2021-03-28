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
public class Facebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many friends for person X?");
        int num = s.nextInt();
         String newName[] = new String [num];
         
        System.out.println("Name: ");
        for(int i = 0; i < num; i++){
        newName[i] = s.next();
        
        }
           int num1 = 0; 
         
        System.out.println("How many friends for person Y?");
        num1 = s.nextInt();
        String newName2[];
        newName2 = new String [num1];
        
        System.out.println("Name:");
        for (int j = 0 ; j< num1; j++){
        newName2[j] = s.next();
        } 
    
        
        System.out.println("You have 2 mutual friends.They are: ");
        for(int i = 0; i < num; i++){
            for (int j = 0 ; j < num1; j++){
                if(newName[i].equals(newName2[j])){
                  System.out.println(newName[i]);
                }
             
            
    }
    

    }
}
}

