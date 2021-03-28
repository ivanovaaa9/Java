/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Filter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int numbers = s.nextInt();

        System.out.printf("Please enter %d numbers: \n", numbers);
        double[] myNums = new double[numbers];
        for (int i = 0; i < myNums.length; i++) {
            myNums[i] = s.nextInt();

        }

        System.out.print("Operation (>, < or =): ");
        String operation = s.next();
        System.out.print("Than: ");
        double than = s.nextDouble();

        for (int i = 0; i < myNums.length; i++) {
            if (operation.equals(">") && myNums[i] > than) {
                System.out.printf("%.1f\n", myNums[i]);

            } else if (operation.equals("<") && myNums[i] < than) {
                System.out.printf("%.1f\n", myNums[i]);
            } else if (operation.equals("=") && myNums[i] == than) {
                System.out.printf("%.1f\n", myNums[i]);
            }

        }

    }

}
