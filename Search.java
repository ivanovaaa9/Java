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
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Text: ");
        String text = s.nextLine();
        System.out.println("Search: ");
        String search = s.next();
        
        for(int i = -1; (i = text.indexOf(search, i + 1)) != -1; i++){
         System.out.println("Position: " + i);   
            
        }
        if(!text.contains(search)){
            System.out.println("No match found");
            
        }
        
        
        
        
       
        
        
        
    }
    
}
