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
public class DateConditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year, month, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Year: ");
        year = s.nextInt();
        System.out.print("Month: ");
        month = s.nextInt();
        System.out.print("Day: ");
        day = s.nextInt();
        
        if(year < 1900 || year > 2015) {
            System.out.println("Please use only " +
          "years between 1900 and 2015");
            return;
        }
        if(month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }
        if(day < 1 || day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println("Leap year");
        }
        if((month >= 10 && month <= 12) ||(month >= 1 && month <= 3)) {
            System.out.println("Winter");        
        }
        else if((month >= 6 && month <= 8)) {
            System.out.println("Summer");
        }
        if((month == 6 && day == 1)) {
            System.out.println("International Children's day");
        }
        if(month == 12 && day >= 24 && day <= 26) {
            System.out.println("Merry Christmas");
        }
    
}}
