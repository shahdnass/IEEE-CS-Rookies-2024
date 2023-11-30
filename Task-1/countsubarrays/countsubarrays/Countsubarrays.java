 
package countsubarrays;
 
import java.util.Scanner;

public class Countsubarrays {

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

         
        int T = input.nextInt();

        while (T > 0) {
            
            int N = input.nextInt();

            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }

            
            int count = 0;

            for (int i = 0; i < N; i++) {
                int j = i;
                while (j + 1 < N && arr[j] <= arr[j + 1]) {
                    j++;
                }
                 
                count += (j - i + 1) * (j - i + 2) / 2;
                i = j;  
            }

            
            System.out.println(count);
            T--;
        }
    }
}

        
    
    

