package Days_Of_Code;

import java.util.*;
import java.math.*;

public class Day2_Operators {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double calculatedTotal = mealCost + mealCost*((double)tipPercent/100) + mealCost*((double)taxPercent/100);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(calculatedTotal);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

}
