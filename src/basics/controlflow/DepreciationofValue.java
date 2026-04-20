/*
Calculate the depreciation of value java program 

we use Straight-Line Method, which is the simplest way to determine how much an asset's value decreases over time.
The formula for annual depreciation is:Depreciation = v1-v2/T
   Where:V1: Initial Value (Cost of the asset)
   V2: Salvage Value (Value at the end of its useful life)
   T: Number of years (Time period)
*/

package basics.controlflow;

import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter initial value (V1): ");
        double v1 = in.nextDouble();

        System.out.print("Enter salvage value (V2): ");
        double v2 = in.nextDouble();

        System.out.print("Enter time period in years (T): ");
        double t = in.nextDouble();

        if (t <= 0) {
            System.out.println("Time period must be greater than 0.");
        } else {
            double depreciation = (v1 - v2) / t;
            System.out.println("The annual depreciation is: " + depreciation);
        }
        in.close();
    }
    
}
