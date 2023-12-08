 
package swapping.with.matrix;
 
import java.util.Scanner;

public class SwappingWithMatrix {

     
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
          int N = scanner.nextInt();
          int X = scanner.nextInt();
          int Y = scanner.nextInt();

        
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
         swapRows(A, X , Y );
         swapColumns(A, X , Y );
         
          for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
     }
    
    public static  void swapColumns(int[][] A,int X  ,int Y ){
    
    for (int i = 0; i < A.length; i++) {
            int temp = A[i][X-1];//هنا كنا محتاجين نحدد ال row
            A[i][X-1] = A[i][Y-1];
            A[i][Y-1] = temp;
        }
   }
    
    
     public static void swapRows(int[][] A, int X, int Y) {
        int[] temp = A[X-1];
        A[X-1] = A[Y-1];
        A[Y-1] = temp;
    }
}
    
    
 
