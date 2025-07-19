import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        
        Arrays.sort(arr);
        
        System.out.println("The Sorted array is:");
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
