import java.util.*;

public class leader_number
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();           // Input size 
        int[] a = new int[n];           // arr declare
        // int i;   //common                    
        
        for(int i = 0; i < n; i++)          // Read arr elements
        {
            a[i] = sc.nextInt();  
        }
        
        int max = a[n - 1];            //last 
        System.out.print(max + " ");    // print first leader 
        
        for(int i = n - 2; i >= 0; i--)     // Traverse from right to left
        {
            if(a[i] > max)              // If current is greater than max
            {
                max = a[i];             // Update max
                System.out.print(max + " ");  // Print 
            }
        }
    }
}
