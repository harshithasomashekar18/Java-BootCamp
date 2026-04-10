// Take name as input and print a greeting message for that particular name.
package com.day2;
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = input.nextLine();
        System.out.println("Hi" + " " + name + ", Welcome to the world of Programming!");
        input.close();
    }

  
    
}
