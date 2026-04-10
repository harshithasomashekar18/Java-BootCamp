/*
Question: Take 2 numbers as inputs and find their HCF and LCM.

What is LCM? -> LCM (Least Common Multiple)The LCM of two numbers is the smallest positive integer that is divisible by both numbers.
Example: For 12 and 18:
Multiples of 12: 12, 24, 36, 48...
Multiples of 18: 18, 36, 54...
LCM = 36 
Formula = The Golden Rule: There is a mathematical formula that connects the two:
LCM(a.b) = |a * b| /hcf(a,b)

what is HCF? -> HCF (Highest Common Factor)The HCF (also known as GCD - Greatest Common Divisor) of two or more numbers is the largest positive integer that divides each of the numbers without leaving a remainder.
Example: For 12 and 18:
Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
HCF = 6 

Aproach to find the hcf is :
Efficiency: Instead of checking every number from 1 to $N$, the Euclidean algorithm uses the remainder operator (%), making it incredibly fast even for huge numbers.
Simplicity: Once you have the HCF, the LCM is just one division away.

Euclidean Algorithm:
-> The Euclidean Algorithm is an ancient and efficient way to find the HCF (Highest Common Factor) of two numbers. 
Instead of listing out all the factors (which takes forever for large numbers), it uses a simple property of division.
The core idea is: The HCF of two numbers does not change if the larger number is replaced by its remainder when divided by the smaller number.
How it Works (Step-by-Step)To find the HCF of two numbers, a and b:
1.Divide the larger number by the smaller number.
2.Find the remainder.
3.Replace the larger number with the smaller number, and the smaller number with the remainder.
4.Repeat until the remainder becomes 0.
The last non-zero remainder (or the divisor that made the remainder zero) is your HCF.
*/
package basics.flowofprogram;
import java.util.Scanner;

public class LcmAndHcfOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int num1 = n1;
        int num2 = n2;
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        int hcf = n1;
        int lcm;
        if(hcf == 0){
            lcm = 0;   //to avoid ZerDivisionError
        }
        else{
            lcm = (num1 * num2) / hcf;   // or  lcm = (num1 / hcf) * num2; -> this can handle overflow caused by large numbers
        }
        System.out.println("HCF of two numbers " + num1 + " num2 " + " is " + hcf);
        System.out.println("LCM of two numbers " + num1 + " num2 " + " is " + lcm);
        sc.close();
    }
    
}
