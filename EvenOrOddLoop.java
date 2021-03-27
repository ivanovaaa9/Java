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
public class EvenOrOddLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int startFrom, upTo;
        Scanner s = new Scanner(System.in);
        System.out.print("Start from: ");
        startFrom = s.nextInt();
        System.out.print("Up to: ");
        upTo = s.nextInt();
        
        for(int x = startFrom; x <= upTo; x++) {
            if(x % 2 == 0)
                System.out.println(x + " is even"); 
            else {
                System.out.println(x + " is odd");
            }
        }
        
    }
    
}
