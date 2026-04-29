//Write a program to print the sum of two numbers entered by user by defining your own method.

package basics.methods;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.print("Enter the first number: ");

int num1=sc.nextInt();

System.out.print("Enter the second number: ");

int num2=sc.nextInt();

sc.close();//closing the scanner class

sumNum(num1,num2); //calling the method
}
//sum method
public static void sumNum(int num_A,int num_B){
int sum=0;
sum=num_A + num_B;
System.out.println("Sum of two numbers  "+sum);

 }
    
}
