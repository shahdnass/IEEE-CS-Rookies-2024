 
package encrypt.and.decrypt;

import java.util.Scanner;

 
public class EncryptAndDecrypt {

     
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        // Read the operation type (1 for encryption, 2 for decryption)
        int Q = scanner.nextInt();
        String S = scanner.next();
        String key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        String original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        
        if(Q==1){
              for (int i = 0; i < S.length(); i++) {
               for (int j = 0; j < original.length(); j++){
                   if(S.charAt(i)==original.charAt(j)){
                    System.out.print(key.charAt(j));
                    break;
                   }
               }
              }
         
        }else{
            
             for (int i = 0; i < S.length(); i++) {
               for (int j = 0; j < key.length(); j++){
                   if(S.charAt(i)==key.charAt(j)){
                    System.out.print(original.charAt(j));
                    break;
                   }
               }
              }
        
        }
    }
    
}
