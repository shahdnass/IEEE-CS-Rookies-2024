 
package conversion;

import java.util.Scanner;

 
public class Conversion {
 
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
 
        String S = scanner.nextLine();
        
        char[] charArray = S.toCharArray();
        
        for (int i = 0; i < S.length(); i++) {
            
            if (charArray[i] == ',') {
                 charArray[i] = ' ';
            } else if (charArray[i] >= 'A' && charArray[i] <= 'Z' ) {
               charArray[i] = (char) ( charArray[i]  + 32);
            } else if (charArray[i] >= 'a' && charArray[i] <= 'z'  ) {
                charArray[i] = (char) ( charArray[i]  - 32); 
            }
        }
        
           S = new String(charArray);   // S= charArray.toString();
          System.out.println( S );
    
    }
    
}
 