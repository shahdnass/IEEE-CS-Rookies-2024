 
package combinationandpermutation;

import java.util.Scanner;

 
public class COMBINATIONANDPERMUTATION {

     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        long ncr = factorial(A) / (factorial(B) * factorial(A - B));//COMBINATION
        long npr = factorial(A) / factorial(A - B);//PERMUTATION

        System.out.println(ncr + " " + npr);
    }

     
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

     
    }
   
 
