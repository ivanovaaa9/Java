/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author NIKOL
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = s.next();
        int sum = 0;

        char[] digits = number.toCharArray();

        for (int i = 0; i < digits.length; i++) {

            System.out.println("digit " + (i + 1) + ": " + digits[i] + " ("
                    + digits[i] + ") ");
            int value = Character.getNumericValue(digits[i]);
            sum += value;

        }

        System.out.println("The sum is " + sum);
    }

}
