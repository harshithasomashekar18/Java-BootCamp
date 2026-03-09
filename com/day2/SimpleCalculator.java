//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.day2;
import java.util.Scanner;

//Aproach: while loop + if statements
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
    // take input till user press x
        while(true) {

            //take operater inut
            System.err.println();
            System.out.print("Enter a operator:");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //take input as two numbers
                System.out.print("Enter two Numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }else{
                        System.out.println("numerator cant be zer0");
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if(op == 'X' || op == 'x') {
                    break;
             }
            else{
                    System.out.println("Invalid input operator");
             } 
            
        }
        System.out.println(ans);
    }
    
 }
  
 //Aproach 2: if statements only
 //     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a two  Numbers :");
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         System.out.println();
//         System.out.print("Enter a operator:");
//         char op =sc.next().trim().charAt(0);
//         int ans = 0;
//         if(op == '+') {
//             ans = num1+num2;
            
//         } else if(op == '-'){
//             ans = num1-num2;
//         } else if(op == '*'){
//             ans = num1*num2;
//         }else if(op == '/'){
//             if(num2 != 0) {
//                 ans = num1/num2;
//             }else {
//                 System.out.println("ZeroDivisionError:Second cant be zero for performing division operatio");
//             }
//         }else if(op == '%'){
//             ans = num1%num2;
//         }else if(op == 'X' || op == 'x'){
//              System.out.println("Invalid operator");
//         }else{
//             System.out.println("Invalid operator");
//         }
//         System.out.println(ans);
        
      
//     }

