import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        if (year < 1900 || year > 9999 || month < 1 || month > 12) {
            System.out.println(0);
            return;
        }

        int days;

        // Check for February
        if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }
        // Months with 31 days
        else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                 month == 8 || month == 10 || month == 12) {
            days = 31;
        }
        // Months with 30 days
        else {
            days = 30;
        }

        System.out.println(days + " Days");
    }
}
