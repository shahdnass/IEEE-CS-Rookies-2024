 
package shift.right;

import java.util.Scanner;

 
public class ShiftRight {
 
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        } 
        int[] result = rightShiftArray(array, X);
        for (int i=0;i<N;i++) {
            System.out.print(result[i] + " ");
        }
    }
    
     public static int[] rightShiftArray(int[] array, int X) {
     
     while(X>0){
     int temp=array[array.length-1];
     for(int i=array.length-2;i>=0;i--){
     array[i+1]=array[i];
      }
     array[0]=temp;
     X--;
    }
    return array;
     }
    
}
