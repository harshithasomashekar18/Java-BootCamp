package basics.input;
import java.util.Scanner;

public class ArmstrogNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter start number: ");
        int start = in.nextInt();
        System.out.print("Enter end number: ");
        int end = in.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is Armstrong
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        
        // 1. Find the number of digits
        int digits = String.valueOf(n).length();

        // 2. Calculate the sum of digits raised to the power
        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, digits);
            n = n / 10;
        }

        // 3. Compare sum with original number
        return sum == original;
    }
}
    

