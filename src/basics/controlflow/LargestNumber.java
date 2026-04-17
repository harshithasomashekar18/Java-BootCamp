// Take integer inputs till the user enters 0 and print the largest number from all.

package basics.controlflow;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            if (n > max) {
                max = n;
            }
        }

        System.out.println("The largest number is: " + max);
        in.close();
    }
}
