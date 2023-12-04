 
package count.words;

import java.util.Scanner;

 
public class CountWords {

    
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);

       
        String S = scanner.nextLine();

        
        int wordCount = 0;

        boolean t = true;

       
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            
            boolean d =
                    c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '!' || c == '.' || c == '?' || c == ',';

            
            if (!d && t) {
                wordCount++;
            }

           
            t = d;
        }

       
        System.out.println(wordCount);
    }
}

 
    
 
