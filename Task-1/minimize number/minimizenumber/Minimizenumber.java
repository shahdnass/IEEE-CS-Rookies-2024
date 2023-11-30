 
package minimizenumber;

import java.util.Scanner;


public class Minimizenumber {

  
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         boolean flag= true;
          int t=0;
         
        int N = input.nextInt();
 
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        
        
        do{
         for (int i = 0; i < N; i++){
             if(arr[i] % 2 != 0){
                 flag=false;
                 break;
            }
             else {
               arr[i] /= 2;

             }
             
             }
          if(flag)
             t++;
    
    }while(flag);
        
         System.out.println(t);
      
    }

    

}
    
