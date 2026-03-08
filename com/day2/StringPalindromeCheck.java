package com.day2;
import java.util.Scanner;

public class StringPalindromeCheck {
   
    public static void main(String[] args) {
        // 1. Setup Scanner for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        // 2. Prepare the string (lowercase and remove non-alphanumeric for accuracy)
        String clean = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // 3. Logic: Compare characters from both ends
        boolean isPalindrome = true;
        int left = 0;
        int right = clean.length() - 1;
        
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break; // Stop loop early if mismatch found
            }
            left++;
            right--;
        }
        
        // 4. Output the result
        if (isPalindrome && !clean.isEmpty()) {
            System.out.println("Result: \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}

