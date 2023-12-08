 
package five.in.one;
 
import java.util.Scanner;

public class FiveInOne {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.println("Maximum number: " + Max(array));
        System.out.println("Minimum number: " + Min(array));
        System.out.println("Count of prime numbers: " + countPrimes(array));
       //System.out.println("Count of palindrome numbers: " + countPalindromes(array));
        System.out.println("Number with maximum divisors: " + getMaxDivisorsNumber(array));
    }
    
     public static int Max(int[] array) {
        int max = array[0];
        for (int i=0;i<array.length;i++  ) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    
    public static int Min(int[] array) {
        int min = array[0];
        for ( int i=0;i<array.length;i++ ) {
            if ( array[i] < min) {
                min =  array[i];
            }
        }
        return min;
    }
    
      public static int countPrimes(int[] array) {
        int count = 0;
        for ( int i=0;i<array.length;i++ ) {
            if (isPrime(array[i])) {
                count++;
            }
        }
        return count;
    }
       private static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
       
    /*  
     public static int countPalindromes(int[] array) {
        int count = 0;
        for (int i=0;i<array.length;i++) {
            if (isPalindrome(array[i])) {
                count++;
            }
        }
        return count;
    }
     
     private static boolean isPalindrome(int num) {
  
        
    }
    */
       
       public static int getMaxDivisorsNumber(int[] array) {
    int hasmaxDivisorsNumber = array[0];
    int maxDivisorsCount = countDivisors(array[0]);

    for (int i = 1; i < array.length; i++) {
        int divisorsCount = countDivisors(array[i]);
        if (divisorsCount > maxDivisorsCount || divisorsCount == maxDivisorsCount  )/**/ {
            maxDivisorsCount = divisorsCount;
            hasmaxDivisorsNumber = array[i];
        }
    }

    return hasmaxDivisorsNumber;
}

public static int countDivisors(int num) {
    int count = 0;
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            count++;
        }
    }
    return count;
}

        
}