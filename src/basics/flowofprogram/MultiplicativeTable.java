//Take a number as input and print the multiplication table for it.

package basics.flowofprogram;
import java.util.Scanner;

public class MultiplicativeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (i * num));
        }
        sc.close();
    }
    
}
