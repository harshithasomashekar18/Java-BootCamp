/*
Java Power calculator  program
Approach 1:
Using Math.pow() (The Standard Way)

Approach 2:
Using Loop
  Algorithm:
1.Get Base and Exponent from user
2. Initialize the result variable
3.Multiply 'result' by 'base', 'exponent' times
4. Output the result
*/

package basics.controlflow;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Get Base and Exponent from user
        System.out.print("Enter the base (integer): ");
        int base = in.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int exponent = in.nextInt();

        // We use 'long' to prevent overflow for larger results
        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        in.close();

    }
}
