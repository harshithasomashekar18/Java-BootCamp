package basics.flowofprogram;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int c = 2;
        boolean isPrime = true;

        if (n == 1) {
            System.out.println(n + " is neither prime nor composite.");
            isPrime = false;
        } else if (n == 0) {
            System.out.println("Zero is not a prime number (primes must be greater than 1).");
            isPrime = false;
        } else if (n < 0) {
            System.out.println("Negative numbers cannot be prime.");
            isPrime = false;
        } else {
            // This 'else' ensures the loop ONLY runs for n >= 2
            while (c * c <= n) {
                if (n % c == 0) {
                    isPrime = false;
                    System.out.println(n + " is a composite number.");
                    break;
                }
                c++;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is a Prime number.");
        }
        sc.close();

    }
}
