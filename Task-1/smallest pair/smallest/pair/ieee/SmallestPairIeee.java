 
package smallest.pair.ieee;

import java.util.Scanner;

 
public class SmallestPairIeee {

     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
        
             int N = input.nextInt();
             int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }
            
             int result= Integer.MAX_VALUE;;
             
             for (int i = 0; i < N-1 ; i++) {//ده هيوصل لغاية الرقم الي قبل الاخير
            for (int j = i + 1; j < N; j++) {//ده هيوصل للرقم الاخير
                int pair  = arr[i] + arr[j] + (j+1) - (i+1);
                 result=Math.min(pair,result);//للحصول علي اصغرناتج طوال ال لوب
        
         }
       
    }
              System.out.println(result);
             t--;
    
}
    }}
