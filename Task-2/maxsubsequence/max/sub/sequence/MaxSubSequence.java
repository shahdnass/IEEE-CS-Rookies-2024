  
package max.sub.sequence;

import java.util.Scanner;

 
public class MaxSubSequence {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

         int maxSize = 1;  
         int currentSize = 1;  

       
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                currentSize++;
            } else {
                maxSize = Math.max(maxSize, currentSize);
                currentSize = 1;
            }
        }

        
        maxSize = Math.max(maxSize, currentSize);

        
        System.out.println(maxSize);
    }
}
 
         
    
    
 
