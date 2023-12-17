 
package print.from.pkg1to.n;
 
import java.util.Scanner;

public class PrintFrom1toN {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
         print(1,N);
         
    }
    public static void print(int x,int N){
    if(x<=N){
    System.out.println(x);
    print(x+1,N);
    }
    
    }
    
}
