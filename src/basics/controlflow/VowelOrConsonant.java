package basics.controlflow;

import java.util.Scanner;

public class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        // Read the first character of the input string
        char ch = in.next().toLowerCase().charAt(0);

        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabetical character.");
        }
    }
}