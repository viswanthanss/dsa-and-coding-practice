import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set = new HashSet<>();

        int left =0;
        // int i =0;
        int maxLength = 0;

        for(int i=0;i<s.length();i++)
        {
            //seen //exists //duplicated
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(left));
                left++;
            }

            //new 

            set.add(s.charAt(i));

            //find valid string's length --> right -left +1;
            int lengthy= (i - left +1);
            maxLength =  Math.max(maxLength,lengthy);
        }

        return maxLength;
    }
}
