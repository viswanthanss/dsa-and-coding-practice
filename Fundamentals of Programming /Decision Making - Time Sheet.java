import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hours = new int[7];
        for (int i = 0; i < 7; i++) {
            hours[i] = sc.nextInt();  // Read 7 integers for the week
        }

        int total = 0;

        for (int i = 0; i < 7; i++) {
            int daily = hours[i] * 100;

            // Overtime for more than 8 hours
            if (hours[i] > 8) {
                daily += (hours[i] - 8) * 15;
            }

            // Sunday bonus
            if (i == 0) {
                daily += daily / 2;  // 50% bonus
            }

            // Saturday bonus
            if (i == 6) {
                daily += daily / 4;  // 25% bonus
            }

            total += daily;
        }

        System.out.println(total);
    }
}
