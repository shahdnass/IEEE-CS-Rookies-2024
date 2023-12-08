 
package prime.function;

import java.util.Scanner;

 
public class PrimeFunction {

    
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
         int T = scanner.nextInt(); 

         while(T>0) {
            int N = scanner.nextInt();  
            if (isPrime(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
          T--;
    }
    
}
    
    public static boolean isPrime(int N){
        if(N<=1)//علشان ال 0 و1
            return false;
        
        
           for (int i = 2; i <= N/2; i++) {
            if (N % i == 0) {
                return false;  
            }
        }
          return true;
  }
}