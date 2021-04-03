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
public class MatrixDiagonals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Size: ");
        int size = s.nextInt();
        
        char [][] m = new char [size][size];
        
        for ( int i  = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
            if (i == j){
                m[i][j] = 'X';
                
            }   else if((i + j) == (size - 1)){
                m[i][j] = 'Y';
                
            } else if (i != j){
                m[i][j] = '-';
            }
            System.out.print(m[i][j]);
            
            }
            System.out.println("");
            
        }
        
        
            
    }
    
}
