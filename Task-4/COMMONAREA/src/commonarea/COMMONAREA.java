 
package commonarea;

import java.util.Scanner;

 
public class COMMONAREA {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       long T = scanner.nextLong();
        
       for (long k = 1; k<= T; k++) {
            
            int N = scanner.nextInt();

             
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int maxx1=x1;
            int maxy1=y1;
            int minx2=x2;
            int miny2=y2;

          for (int i = 1; i < N; i++) {
              x1 = scanner.nextInt();
              y1 = scanner.nextInt();
              x2 = scanner.nextInt();
              y2 = scanner.nextInt();

                 maxx1 = Math.max( maxx1, x1);
                 maxy1 = Math.max( maxy1, y1);
                 minx2 = Math.min(minx2, x2);
                 miny2 = Math.min(miny2, y2);
             
            }
          
          if( maxx1< minx2&&maxy1< miny2){
           System.out.println("Case #" + k + ": " + (minx2-maxx1)*(miny2-maxy1));
          
          }else{
          System.out.println("Case #" + k + ": " + "0");
             
        }
        
       }
}
}

        
  
    
 
