import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
                
        
        System.out.println("Enter n");
        
        int n = sc.nextInt();
        
        System.out.println("Enter m");
        int m= sc.nextInt();
        
        System.out.println("The multiplication table of "+ n + " is");
        
        for(int i=1;i<=m ; i++)    //range[1,<=m]
        {
            System.out.println(i+"*"+n+"="+ (i*n));
        }
        
    }
}
