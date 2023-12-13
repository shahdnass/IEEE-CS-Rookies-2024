 
package convertbase;

import java.util.Scanner;
import java.util.Stack;

 
public class CONVERTBASE {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         Stack<Object> stack = new Stack<>();
        int T= scanner.nextInt();
        String N= scanner.next();
        int X= scanner.nextInt();
        int i=0;
        int r=0;
         
       
        
        if(T==1){
           char[] charArray = N.toCharArray();
           for (int j = N.length() - 1; j >= 0; j--) {
               if(Character.isDigit(charArray[j])){
               r+=(charArray[j]-'0')*Math.pow(X,i);
                
               }
               else{
                r+=(charArray[j] - 'A' + 10)*Math.pow(X,i);
              }
                i++;
            
  }
     System.out.print(r);     
        
   }
      
         if(T==2){
         int intValue = Integer.parseInt(N);
           while(intValue!=0){
               if(intValue%X<10){
                 stack.push(intValue%X);
               }else{
               char value = (char)('A' + (intValue%X) - 10);
                stack.push(value);
                }
           intValue/=X;
       }
        while(!stack.empty()){
     System.out.print(stack.pop());

}
     }
    }
}
