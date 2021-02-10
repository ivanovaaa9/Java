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
public class AirConditioner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int external, internal, desired;
        Scanner s=new Scanner(System.in);
        
        System.out.println("External temp: ");
        external = s.nextInt();
        
        System.out.println("Internal temp: ");
        internal = s.nextInt();
        
        System.out.println("Desired temp: ");
        desired = s.nextInt();
        
        if(desired < internal && external > internal ){
            System.out.println("MAX COLD MODE");
            return;
        }
       if(desired < internal && external <= internal){
           System.out.println("ENERGY SAVING COLD MODE");
           return;
       }
       if(desired > internal && external < internal){
           System.out.println ("MAX WARM MODE");
           return;
       }
       if (desired > internal && external >= internal) {
           System.out.println("ENERGY SAVING WARM MODE");
           return;
       }
       if (desired == internal){
           System.out.println("PAUSED");
           
       }
       
    }
}

    
    

