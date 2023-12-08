 
package equation;
 import java.util.Scanner;
public class Equation {

     
    public static void main(String[] args) {
     
   Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        int N = scanner.nextInt();
        
         System.out.println(EquationResult(X, N));
    }

    public static long EquationResult(long X, int N) {
        long result =-1;
  for (int i = 0; i <= N; i += 2) {
            result += Math.pow(X, i);
        }

        return result;
    }
}
 
        
    
    
 
