package com.day2;
import java.util.*;

public class ReversePrintNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
            
        }
    }
    
}
