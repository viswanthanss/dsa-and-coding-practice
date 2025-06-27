import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // input reader

        int n = sc.nextInt();  // read the position from 1 to 9

        int row = (n - 1) / 3;  // calculate row index
        int col = (n - 1) % 3;  // calculate column index

        System.out.println(row + " " + col);  // print result
    }
}


https://chatgpt.com/share/685ecdf8-df28-8010-a252-e7a06a3e796b
