 
package findmaxpath;

import java.util.Scanner;

 
public class Findmaxpath {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
 
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSum = findMaxPathSum(matrix, 0, 0);
        System.out.println(maxSum);
  }

     
    public static int findMaxPathSum(int[][] matrix, int i, int j) {
        int rightSum=matrix[i][j];
        int downSum=matrix[i][j];
        if (j < matrix[0].length - 1) {
            rightSum += findMaxPathSum(matrix, i, j + 1);
        }

        
        if (i < matrix.length - 1) {
            downSum += findMaxPathSum(matrix, i + 1, j);
        }

        
        return  Math.max(rightSum, downSum);
    }
}
   
    
 
