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
public class Factorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("From: ");
        int from = s.nextInt();
        System.out.print("To: ");
        int to = s.nextInt();
        
        for(int num = from; num <= to; num++) {
            long factorial = 1;
            for(int j = 1; j <= num; j++) {
                factorial *= j;
        }
            System.out.printf("%d = %d\n", num, factorial);
        }
    }
    
}

