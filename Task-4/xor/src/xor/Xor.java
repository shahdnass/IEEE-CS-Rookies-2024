 
package xor;

import java.util.Scanner;

 
public class Xor {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long Q = scanner.nextLong();
        long result=findtheresult(A,B,Q);
        System.out.println(result);
     }
     public static long findtheresult(long a,long b,long f){
      
      f%=3;
     if(f==1){
       return a;
     }else if(f==2){
       return b;
     }
       return a^b;//xor
     }
}


 /*this give runtime error */
        /*
         Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long Q = scanner.nextLong();
       Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long Q = scanner.nextLong();
        long result=findtheresult(A,B,Q);
        System.out.println(result);
        
       
    }
    
    public static long findtheresult(long a,long b,long f){
       return (f == 1) ? a : (f == 2) ? b : findtheresult(a, b, f - 1) ^ findtheresult(a, b, f - 2);
    */
        
