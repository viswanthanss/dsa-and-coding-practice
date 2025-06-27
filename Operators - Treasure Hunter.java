import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // for input

        int total = sc.nextInt();  // total coins
        int x = sc.nextInt();      // Long Ben's % share
        int y = sc.nextInt();      // Blackbeard's % share (after Ben)

        int benShare = total * x / 100;                      // Ben's share
        int remainingAfterBen = total - benShare;            // coins left

        int blackbeardShare = remainingAfterBen * y / 100;   // Blackbeard's share
        int remainingAfterBlackbeard = remainingAfterBen - blackbeardShare;

        int pirateShare = remainingAfterBlackbeard / 3;      // share for each of 3 pirates

        System.out.println(benShare);
        System.out.println(blackbeardShare);
        System.out.println(pirateShare);
    }
}
