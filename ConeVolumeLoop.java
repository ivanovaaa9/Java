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
public class ConeVolumeLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        System.out.print("Max radius: ");
        int radius = s.nextInt();
        System.out.print("Max height: ");
        int height = s.nextInt();
        double result = 0;
        for(int i = 1; i<=radius;i++){
            for(int j = 1; j<=height;j++){
                  System.out.println("radius " + i +", height "+j+":");
                  result = (Math.PI*i*i*j)/3;
                  System.out.printf("volume: %.2f", result);
                  System.out.println();
                  
            }
          
        }
    }
    
}

