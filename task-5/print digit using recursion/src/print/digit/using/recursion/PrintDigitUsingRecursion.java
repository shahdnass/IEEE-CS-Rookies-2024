 
package print.digit.using.recursion;

import java.util.Scanner;

 
public class PrintDigitUsingRecursion {
 
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
       int T=scanner.nextInt();
       
        while(T>0){
       String N=scanner.next();
       printseparately(N,0);
        System.out.println();
      T--;
       }
    }
        public static void printseparately(String N ,int i){
         char[] charArray = N.toCharArray();
         System.out.print(charArray[i]+" ");
         if(i<charArray.length-1){
         printseparately(N,i+1);
         }
      
        }
        /*ده بيديني ايرور في تيست كيس الخامسه
       Scanner scanner = new Scanner (System.in);
       int T=scanner.nextInt();
        while(T>0){
       long N=scanner.nextInt();
       printseparately(N);
       System.out.println();
      T--;
       }
    }
    public static void printseparately (long N){
   if(N>=1){
    printseparately(N/10);
    System.out.print( N%10 +" ");
   }*/
    }
    
 
