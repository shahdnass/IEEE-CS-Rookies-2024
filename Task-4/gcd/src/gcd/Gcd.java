 
package gcd;

import java.util.Scanner;

 
public class Gcd {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long gcd= calculateGCD(A,B);
        long lcm=(A*B)/calculateGCD(A,B);
      
         System.out.println(gcd + " " + lcm);
    }
    public static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}    
        
        /*
        if(A>B&&B!=0){
        gcd=A-((A/B)*B);
        System.out.println(gcd);
    }else if(B>A&&A!=0){
         gcd=B-((B/A)*A);
        }
         lcm = (A * B) / gcd;
         System.out.println(gcd + " " + lcm);
       -----------------------------------------  
        long G;
        int i=2; 
        if(A>B){
         G=A;
        }else{
         G=B;
        }
        while(true){
        if(G%A==0&&G%B==0){
        lcm=G;
        break;
         }else{
        G*=i;
        i++;
         }
         }
         System.out.println(gcd + " " + lcm);
    }
    */
 
 
