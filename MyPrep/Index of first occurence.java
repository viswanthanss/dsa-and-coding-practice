import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input strings
        String txt = sc.nextLine();
        String pat = sc.nextLine();

        // Use indexOf to find the first occurrence
        int index = txt.indexOf(pat);

        // Check and print result
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
