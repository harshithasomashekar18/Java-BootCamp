/*Calculate the Batting Average program
Formula: totalRuns / timesOut
 */

package basics.controlflow;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total runs scored: ");
        int totalRuns = in.nextInt();

        System.out.print("Enter total matches played: ");
        int totalMatches = in.nextInt();

        System.out.print("Enter number of times remained not out: ");
        int notOut = in.nextInt();

        // The divisor is the number of times the player actually got out
        int timesOut = totalMatches - notOut;

        // Handle the case where the player has never been out (Average is technically infinite/undefined)
        if (timesOut <= 0) {
            System.out.println("Batting Average: " + totalRuns + " (Player never got out)");
        } else {
            double battingAverage = (double) totalRuns / timesOut;
            System.out.printf("Batting Average: %.2f\n", battingAverage);
        }
        
        in.close();
    }
    
}
