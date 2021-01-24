import java.math.*;
import java.util.*;

// Question 1 = Java Primality Test
// Question 2 = Java BigInteger

public class Answers {
    public static void Question1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        BigInteger b1 = new BigInteger(n);
        if(b1.isProbablePrime(1))System.out.println("prime");
        else System.out.println("not prime");
        scanner.close();
    }
    public static void Question2(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.next());
        BigInteger b2 = new BigInteger(sc.next());
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        sc.close();
    }
}
