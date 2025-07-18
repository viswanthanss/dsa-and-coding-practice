import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int tree = sc.nextInt();

        if (tree <= cols || (tree - 1) % cols == 0 || tree % cols == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
