/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Alarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int hour;
        System.out.println("Hour: ");
        hour = s.nextInt();
        
        if(hour < 0|| hour > 23) {
            System.out.println("Incorrect hour value ");
            return;
        }
        int minutes;
        System.out.println("Minutes: ");
        minutes = s.nextInt();
        if(minutes < 0|| minutes > 59) {
            System.out.println("Incorrect minutes value ");
            return;
        }
        String melody;
        System.out.println("Which melody do you want to play? ");
        melody = s.next();
        if(!melody.equalsIgnoreCase("Bell") && !melody.equalsIgnoreCase("Chime")) {
            System.out.println("Unavailable melody");
            return;
        }
        int snooze;
        System.out.println("Snooze duration (0 for no snoozing)");
        snooze= s.nextInt();
        if(snooze==00) {
            System.out.println("No snoozing");
        }
        System.out.printf("An alarm for %d:%d has been set.The melody will be %s\n",
                hour, minutes, melody);
        }
    }
    

