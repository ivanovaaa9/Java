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
public class ManyDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    while(true){
        System.out.print("Date: ");
        String input = s.next();
        if(input == "END"){
            break;
        }
        String [] inputSplit = input.split("[.]");
        
        String month = inputSplit[1];
        boolean monthIsValid = month.matches("^[0][1-9]|^[1][012]");
        if(!monthIsValid){
            System.out.println("No such month");
            continue;
        }
        String day = inputSplit[0];
        boolean dayIsValid = day.matches("^[012][0-9]|^[3][01]");
        if(!dayIsValid){
            System.out.println("No such day: ");
            continue;
        }
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + inputSplit[2]);
    }
    }
    
}
