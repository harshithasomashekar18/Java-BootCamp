/*
Question: Input a year and find whether it is a leap year or not.

*what is leap year ?
A leap year is a calendar year containing 366 days instead of 365, with an extra day added to February (Feb 29) to keep our calendar aligned with the Earth's orbit around the sun. These years occur every four years, with the next leap year occurring in 2028. 
The extra day corrects the difference between our 365-day calendar and the solar year, which is roughly 365.24 days.

*Key Facts About Leap Years
1.Purpose: The main purpose of a leap year is to align the calendar year with the astronomical, or solar, year, ensuring seasons fall in the same months every year.
2.When they occur: Generally every 4 years, such as 2024, 2028, 2032, etc..
3.Next Leap Year: The next leap year is 2028.
4.Rules for Determination:
The year must be evenly divisible by 4.
If the year is divisible by 100, it is not a leap year, unless it is also divisible by 400.
Therefore, 2000 was a leap year, but 1900 was not.
Days in a Leap Year: 366 days, with February 29th being the added day.
 */
package basics.flowofprogram;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close(); 
    }
    
}

