

package max.subarray.ieee;
 
import java.util.Scanner;

public class MaxSubarrayIeee {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];
            
            
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            
            
             // Iterate through all subarrays and find the maximum number in each
            for (int i = 0; i < N; i++) {
                int maxnumber = arr[i];
                System.out.print(maxnumber + " ");

                for (int j = i + 1; j < N; j++) {
                    maxnumber = Math.max(maxnumber, arr[j]);
                    System.out.print(maxnumber + " ");
                }
            }

            System.out.println();  
            t--;
        }
    }
}

    
       /* Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];
            int maxnumber=0;
            
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            
             for (int i = 0; i < N; i++) {
                 maxnumber = arr[i];
                System.out.print(maxnumber + " ");
                
        }
             maxnumber=arr[0];
              for (int j = 1; j < N; j++) {
                    maxnumber = Math.max(maxnumber, arr[j]);
                     
                }
              System.out.print(maxnumber + " ");
              
              
               for (int i = 0; i < N; i++) {
                 for (int j = i+1; j < N; j++) {
                    maxnumber = Math.max(arr[i], arr[j]);
                    System.out.print(maxnumber + " ");
                    break;
                }
            }
             
             
              t--;
    
    }
    }
}*/