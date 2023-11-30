 
package permutation.with.arrays;

import java.util.Scanner;

 
public class PermutationWithArrays {
 
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        boolean flag = true;
        int N = input.nextInt();

         
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }

        
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = input.nextInt();
        }
        
        
          for (int i = 0; i < A.length; i++) {
              boolean found = false;
            for (int j = 0; j < A.length; j++) {
                
                if(B[i]==A[j]){
                    found= true;
                    break;
                }  
             }
            
             if (!found) {
                flag = false;
                break;   
            }
           }
          
          if (flag) {
               System.out.println("yes");
            
        } else {
           System.out.println("no");  
             
        }

        
    }
    
}
