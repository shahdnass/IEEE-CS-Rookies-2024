 
package sub.sequence.string;

import java.util.Scanner;

 
public class SubSequenceString {

     
    public static void main(String[] args) {
        
           Scanner scanner = new Scanner(System.in);
           String S = scanner.next();
           String sub = "hello";
           boolean flag=false;
           int k=0;
           
           for (int i = 0; i < sub.length(); i++) {
                flag=false;
               for (int j = k; j < S.length(); j++){
                   if (S.charAt(j) == sub.charAt(i)) {
                       flag=true;
                       k=j+1;
                       break;
                 }
            }
                if (!flag) {
                 break;
            }
        }
           
           if(flag) 
            System.out.println("YES");
         else  
            System.out.println("NO");
        
           
         }
        
    }
    
 
