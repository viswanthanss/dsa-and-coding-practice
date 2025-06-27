import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // to read input

        double principal = sc.nextDouble();   // loan amount
        double rate = sc.nextDouble();        // interest rate per year
        double years = sc.nextDouble();       // number of years

        // Calculate simple interest
        double interest = (principal * rate * years) / 100;

        // Total amount = principal + interest
        double totalAmount = principal + interest;

        // Discount is 2% on the interest
        double discount = (2 * interest) / 100;

        // Final amount to be paid = total - discount
        double finalAmount = totalAmount - discount;

        // Print all values rounded to 2 decimal places
        System.out.printf("%.2f\n", interest);
        System.out.printf("%.2f\n", totalAmount);
        System.out.printf("%.2f\n", discount);
        System.out.printf("%.2f\n", finalAmount);
    }
}
