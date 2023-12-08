 
package print;

import java.util.Scanner;

 
public class Print {
 
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
         printnumbersuptoN(N);
     
    }
    
   public static void  printnumbersuptoN(int N){
        for (int i = 1; i <= N; i++) {
                 if (i == N) {
                    System.out.print(i);//علشان مكنتش في مسافه بعد ال  N
                } else {
                    System.out.print(i + " ");
                }
   }
   }
    
}
