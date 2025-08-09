import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(); // store answers

        for (int i = 1; i <= n; i++) { // loop from 1 to n
            if (i % 3 == 0 && i % 5 == 0) { // divisible by both 3 and 5
                result.add("FizzBuzz");
            } else if (i % 3 == 0) { // divisible by 3 only
                result.add("Fizz");
            } else if (i % 5 == 0) { // divisible by 5 only
                result.add("Buzz");
            } else { // not divisible by 3 or 5
                result.add(String.valueOf(i)); // convert number to string
            }
        }

        return result; // return the list
    }
}
