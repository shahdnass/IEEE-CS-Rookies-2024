 
package pkg3n.pkg1.sequence;

import java.util.Scanner;

 
public class Sequence {
    private static int count = 0;
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int N = scanner.nextInt();
          System.out.println(Seq(N));

    }
    public static int Seq(int n) {
      count=count+1;
         if (n == 1) 
            return 1;
         if (n % 2 != 0) {
         Seq(3 * n + 1);
        } else {
         Seq(n / 2);
        } 
         
         return count;
    }   
    
}
