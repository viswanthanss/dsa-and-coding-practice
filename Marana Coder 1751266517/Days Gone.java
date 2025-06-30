import java.util.Scanner; // to take input from user

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create scanner to read input
        String date = sc.nextLine().trim();  // read the full date and remove extra spaces

        String[] part = date.split("/");     // split date into parts using "/"

        int day = Integer.parseInt(part[0]); // get day as number
        int mon = Integer.parseInt(part[1]); // get month as number
        int yr = Integer.parseInt(part[2]);  // get year as number

        int total = 0; // to store total days passed from Jan 1

        // Add month-by-month days one by one (if that month is before current month)
        if (mon > 1) total += 31; // add January
        if (mon > 2) { // for February, check if year is leap or not
            if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
                total += 29; // leap year Feb has 29 days
            } else {
                total += 28; // normal Feb has 28 days
            }
        }
        if (mon > 3) total += 31; // March
        if (mon > 4) total += 30; // April
        if (mon > 5) total += 31; // May
        if (mon > 6) total += 30; // June
        if (mon > 7) total += 31; // July
        if (mon > 8) total += 31; // August
        if (mon > 9) total += 30; // September
        if (mon > 10) total += 31; // October
        if (mon > 11) total += 30; // November

        total += day; // finally add current day

        System.out.println("Completed days:" + total); // print total days completed
    }
}
