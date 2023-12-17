 
package reach.value;
 
import java.util.Scanner;

public class REACHVALUE {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int T = scanner.nextInt();

       while(T>0) {
           long N = scanner.nextLong();

            if (canReach(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
  
    }

    public static boolean canReach(long N) {
         if (N == 1) {/*دي الحاله الي هنقف عندها*/
            return true;
        }
          if (N % 10 == 0 && canReach(N / 10)) {
            return true ;//هنا لو كنت قولت return canreach(N/10)كان هيبقي في error في200 لان كان هيختبرها مع العشره للاخر لغايه ما يوصلها للاتنين وساعتها لودخلت مع20 مكنش كده كده هينفع
        } else if (N % 20 == 0 && canReach(N / 20)) {
            return  true;
        }else
            return false;
           
        }
    }

     
    

