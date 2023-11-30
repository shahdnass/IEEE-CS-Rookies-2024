 
package replace.min.max;

import java.util.Scanner;

 
public class ReplaceMinMax {

     
    public static void main(String[] args) {
     
          Scanner input = new Scanner(System.in);
        int N = input.nextInt();
          int[] A = new int[N];
         for (int i = 0; i < N; i++) {
              A[i] = input.nextInt();
          }
  
          
          int min = A[0], max = A[0];
          int minIndex = 0, maxIndex = 0;
 
          for (int i = 1; i < N; i++) {
              if (A[i] < min) {
                  min = A[i];
                  minIndex = i;
              }
              if (A[i] > max) {
                  max = A[i];
                  maxIndex = i;
              }
          }
        
          int temp = A[minIndex];
          A[minIndex] = A[maxIndex];
          A[maxIndex] = temp;
  
           
          for (int i = 0; i < N; i++) {
              System.out.print(A[i] + " ");
          }
      }
    }
    
