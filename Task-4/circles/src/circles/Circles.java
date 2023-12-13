 
package circles;

import java.util.Scanner;

 
public class Circles {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          //  for circle A
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
         double centerXA = (x1 + x2) / 2.0;
         double centerYA = (y1 + y2) / 2.0;
         double radiusA = Math.sqrt(Math.pow(x1 - centerXA, 2) + Math.pow(y1 - centerYA, 2));

        //  for circle B
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        double centerXB = (x3 + x4) / 2.0;
        double centerYB = (y3 + y4) / 2.0;
        double radiusB = Math.sqrt(Math.pow(x3 - centerXB, 2) + Math.pow(y3 - centerYB, 2));

        //  distance between centers
        double distance = Math.sqrt(Math.pow(centerXA - centerXB, 2) + Math.pow(centerYA - centerYB, 2));

        // Check  
        if (distance < radiusA + radiusB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
    
    
 
