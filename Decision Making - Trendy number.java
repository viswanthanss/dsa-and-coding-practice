//middle number extraction
//hero part   int middle = (n/10) % 10;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Invalid Number");
        } else {
            int middle = (n/10) % 10; // extract middle digit
            
            if (middle % 3 == 0)
                System.out.println("Trendy Number");
            else
                System.out.println("Not a Trendy Number");
        }
    }
}


// code:https://chatgpt.com/share/6860129d-1528-8010-9278-7b0caa793063
