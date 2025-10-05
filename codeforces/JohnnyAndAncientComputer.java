import java.util.*;

public class JohnnyAndAncientComputer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();  // how many test cases

        for (int i = 0; i < tests; i++) {

            long a = sc.nextLong();  // starting number
            long b = sc.nextLong();  // target number

            // ✅ Case 1: both are same → 0 operations
            if (a == b) {
                System.out.println(0);
                continue;
            }

            // ✅ Make sure a < b (swap if needed)
            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }

            // ✅ If b is not divisible by a → not possible
            if (b % a != 0) {
                System.out.println(-1);
                continue;
            }

            long ratio = b / a;  // how many times a fits into b

            // ✅ Check if ratio is a power of 2
            if ((ratio & (ratio - 1)) != 0) {
                System.out.println(-1);
                continue;
            }

            // ✅ Count how many times we can divide ratio by 2
            int count = 0;
            while (ratio > 1) {
                ratio = ratio / 2;
                count++;
            }

            // ✅ Every 3 divides (8x) = 1 step
            // if leftover 1 or 2 divides → need +1 step
            int steps = count / 3;
            if (count % 3 != 0) {
                steps++;
            }

            // ✅ Print the answer
            System.out.println(steps);
        }
    }
}

/*
# Johnny and Ancient Computer 🧮

**Platform:** Codeforces  
**Difficulty:** Easy-Medium  
**Concepts Used:** Bitwise, Loops, Math (Power of 2)

### Problem Summary
Given two numbers `a` and `b`, find the minimum number of operations to convert `a` into `b`.  
Allowed operations are multiplying or dividing by `2`, `4`, or `8`.

*/

