 
package pkgnew.array;

import java.util.Scanner;

 
public class NewArray {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrayA = new int[N];
        for (int i = 0; i < N; i++) {
            arrayA[i] = scanner.nextInt();
        }

        
        int[] arrayB = new int[N];
        for (int i = 0; i < N; i++) {
            arrayB[i] = scanner.nextInt();
        }
 
        int[] arrayC = concatenateArrays(arrayB, arrayA);
         for (int i=0;i<arrayC.length;i++) {
            System.out.print(arrayC[i]+ " ");
        }
    }
    
     public static int[] concatenateArrays(int[] B, int[] A) {
        int size = A.length + B.length;
        int[] result = new int[size];
        
        for (int i = 0; i < B.length; i++) {
            result[i] = B[i];
        }

        
        for (int i = 0; i < A.length; i++) {
            result[B.length + i] = A[i];
        }

    return result;
     }
}
 
