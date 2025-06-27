import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // input reader
        int units = sc.nextInt();             // read units consumed
        double bill = 0;                      // to store final bill

        if (units <= 200) {
            bill = units * 0.5;
        } else if (units <= 400) {
            bill = units * 0.65 + 100;
        } else if (units <= 600) {
            bill = units * 0.80 + 200;
        } else {
            bill = units * 1.25 + 425;
        }

        // Print final amount as integer with "Rs." prefix
        System.out.println("Rs." + (int)bill);
    }
}


/*
You must calculate the bill in Rupees using the following rules:

Units Consumed	Cost Per Unit	Extra Charge
≤ 200	₹0.50	₹0
201 to 400	₹0.65	₹100
401 to 600	₹0.80	₹200
> 600	₹1.25	₹425

*/
