 
package wonderful.number;

import java.util.Scanner;

 
public class WonderfulNumber {
 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int N= scanner.nextInt();
  
        if (isWonderful(N))  
            System.out.println("YES");
         else  
            System.out.println("NO");
       
        
    }
    
    public static boolean isWonderful(int N){
        
        return (N%2!=0 && isPalindrome(N));
      }
    
    public static boolean isPalindrome(int N){
    
      StringBuilder binaryBuilder = new StringBuilder();//**
       String binarystate = binary(N, binaryBuilder);
        int start = 0;
        int end = binarystate.length() - 1;
        while (start < end) {
            if (binarystate.charAt(start) != binarystate.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static String binary(int N, StringBuilder binaryBuilder){
    if(N>0){
    binary(N / 2, binaryBuilder);
    binaryBuilder.insert(0,N%2);
      
    }
    return binaryBuilder.toString();//**
    }
     
}
