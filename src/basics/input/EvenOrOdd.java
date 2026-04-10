/*
Write a program to print whether a number is even or odd, also take input from the user.

*.Even numbers are integers exactly divisible by 2 (remainder 0), ending in 0, 2, 4, 6, or 8.
*. Odd numbers are integers not divisible by 2 (remainder 1),ending in 1, 3, 5, 7, or 9. 
Examples include 2, 4, 8 (Even) and 1, 3, 7 (Odd)

Key Differences and Properties: 

Definition: Even numbers divide by 2 perfectly; odd numbers do not.

Identification: Look at the last digit. If it is 0, 2, 4, 6, or 8, it is even. Otherwise, it is odd.

Parity Arithmetic:

Even +- Even = Even
Odd +- Odd = Even
Even +- Odd = Odd
Even * Even = Even
Even * Odd = Even
Odd * Odd = Odd
Negative Numbers: The rules apply to both positive and negative integers (e.g.-2 is even-3 is odd). 

Examples
Even: -4, 0, 2, 10, 26, 100
Odd: -3, 1, 5, 11, 27, 99
 */
package basics.input;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num % 2 == 0 ) {
            System.out.println("The Entered number " + num + " " + "is even");
        }else {
            System.out.println("The Entered number " + num + " " + "is odd");
        }
        sc.close();

    }
    
}
