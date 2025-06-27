import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();           // Input size of array
        int[] a = new int[n];           // Declare array
        int i;                          // Loop variable
        
        for(i = 0; i < n; i++)          // Read array elements
        {
            a[i] = sc.nextInt();
        }
        
        int max = a[n - 1];             // Start from last element
        System.out.print(max + " ");    // Last element is always a leader
        
        for(i = n - 2; i >= 0; i--)     // Traverse from right to left
        {
            if(a[i] > max)              // If current is greater than max
            {
                max = a[i];             // Update max
                System.out.print(max + " ");  // Print leader
            }
        }
    }
}



// https://chatgpt.com/share/685e74d9-3db8-8010-998a-524c582100cb
