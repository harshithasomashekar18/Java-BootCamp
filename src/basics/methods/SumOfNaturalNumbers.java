package basics.methods;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    static int findSum(int n){
        int sum = 0;
        
        // iterating over all the numbers 
        // between 1 to n
        for (int i= 1; i <= n; i++) 
        {
            sum = sum + i;
        }
        return sum;
}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSum(n));
    } 
    
}
