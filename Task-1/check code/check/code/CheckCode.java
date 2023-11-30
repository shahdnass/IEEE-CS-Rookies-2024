 
package check.code;

import java.util.Scanner;

 
public class CheckCode {
 
    public static void main(String[] args) {
         boolean flag= true;
         Scanner input = new Scanner(System.in);

        
        int A = input.nextInt();
        int B = input.nextInt();
         input.nextLine();
        String S = input.nextLine();
        
        char[] charArray = S.toCharArray();
        
        
         if (charArray.length == A + B + 1 && charArray[A] == '-') {
         
         for(int i = 0; i < charArray.length; i++){
         if(i != A && !Character.isDigit(charArray[i])){
              System.out.println("No");
              flag= false;
         break;
         }
         }
         
         if(flag)
             System.out.println("Yes");
         }
         else
             System.out.println("No");
        
        
        
    }
       
    }
    

