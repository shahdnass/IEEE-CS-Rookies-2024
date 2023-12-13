 
package bigaddandmultiplication;

import java.math.BigInteger;
import java.util.Scanner;

 
public class Bigaddandmultiplication {

     
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String N = scanner.next();
         BigInteger biginteger1=new BigInteger(N);
         BigInteger biginteger2=new BigInteger("9999");
         System.out.println(biginteger1.add(biginteger2));
        System.out.println(biginteger1.multiply(biginteger2));
    }
}
   
