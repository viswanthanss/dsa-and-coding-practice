class Solution 
{
     public int[] replaceElements(int[] arr) 
     {
        int n = arr.length;
        int max = -1;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) 
        {
            int temp = arr[i];   // store current value
            arr[i] = max;        // replace with greatest so far
            if (temp > max) 
            {
                max = temp;      // update max
            }
        }
      
        return arr;
    }
}
