// class Solution {
//     public List<List<Integer>> generate(int numRows) {
        
//     }
// }

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> triangle = new ArrayList<>(); 

        for (int i = 0; i < numRows; i++) 
        {
            List<Integer> calculation = new ArrayList<>(); // current row

            for (int j = 0; j <= i; j++) 
            {
                // First and last elements of a row are always 1
                if (j == 0 || j == i) 
                {
                    calculation.add(1);
                } 
                else 
                {
                    // Middle values = sum of two values above
                    int middle  = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    calculation.add(middle);
                }
            }

            triangle.add(calculation); // add this row to the triangle
        }

        return triangle;
    }
}
