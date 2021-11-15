/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unwe_examples;

/**
 *
 * @author alex
 */
public class Increment {
    public static void main(String[] args)
    {
    int x;//Variable Declaration
    int y;
    x = 5; //Initialization
    //Incrementation prefix syntax
    y = ++x;
    System.out.print("Prefix:");
    System.out.print("\t");
    System.out.print("x=");
    System.out.print(x);
    System.out.print("\t");
    System.out.print("y=");
    System.out.println(y);
        
    x = 5; //Initialization
    //Incrementation suffix syntax
    y = x++;
    System.out.print("Suffix:");
    System.out.print("\t");
    System.out.print("x=");
    System.out.print(x);
    System.out.print("\t");
    System.out.print("y=");
    System.out.print(y);
    }
}
