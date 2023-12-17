 
package average;

import java.util.Scanner;

 
public class Average {
 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
         int[] array = new int[N];
         for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
       double sum = sum(array,0);
        System.out.printf("%.6f\n", sum/N);
   
    }
  private static double sum(int[] array,int i) {
      double sum=0;
      if(i<array.length){
       sum=array[i]+sum(array,i+1) ;
      }
      return sum;     
}
   
}
