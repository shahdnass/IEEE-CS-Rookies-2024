 
package good.or.bad;

import java.util.Scanner;

 
public class GoodOrBad {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int T = scanner.nextInt();
           
          while(T>0){
               boolean hasPattern010 = false;
               boolean hasPattern101 = false;

           String S = scanner.next();
           
            for (int i = 0; i <= S.length() - 3; i++) {
                if (S.charAt(i) == '0' && S.charAt(i + 1) == '1' && S.charAt(i + 2) == '0') {
                    hasPattern010 = true;
                } else if (S.charAt(i) == '1' && S.charAt(i + 1) == '0' && S.charAt(i + 2) == '1') {
                    hasPattern101 = true;
                }
            }
            
             if ( hasPattern010 || hasPattern101 ) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
           
           T--;
    }
          
            
    
}
}