 
package matrixmultiplication;

import java.util.Scanner;

 
public class Matrixmultiplication {
 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int RA = scanner.nextInt();
         int CA = scanner.nextInt();
         int[][] A = new int[RA][CA];

        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        int RB = scanner.nextInt();
        int CB = scanner.nextInt();
        int[][] B = new int[RB][CB];

        for (int i = 0; i < RB; i++) {
            for (int j = 0; j < CB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
        
        if (CA == RB){
         int[][] result = new int[RA][CB];

        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CB; j++) {
                for (int k = 0; k < CA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }

    }
         for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                  System.out.print(result[i][j] + " "); 
            }
             System.out.println();
         }
 
}
}
}
