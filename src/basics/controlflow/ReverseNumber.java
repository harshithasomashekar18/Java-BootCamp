package basics.controlflow;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----Reverse Number---");
        System.out.println("Enter a number");
        int n = in.nextInt();
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        System.out.println("Reversed Number "+ans);
    }
    
}
