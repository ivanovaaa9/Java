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
public class MatrixHorizontal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int rows, cols;
      System.out.println("How many rows: ");
      rows = s.nextInt();
      System.out.println("How many columns: ");
      cols= s.nextInt();
      
      int[][] m = new int [rows][cols];
      
      for(int i = 0; i < m.length; i++){
          for(int j = 0; j < m[i].length; j++){
              m[i][j] = 1 + j + i *cols;
              
          }
      }
      for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
          System.out.printf("%d\t", m[i][j]);
          
      }
      System.out.println("");
      

      
      }
      
    }
    
}
