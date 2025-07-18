import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        
        for(int i=rows;i>=1;i--)
        {
            for(int j=1;j<=i;j++)    //j<=i
            {
                System.out.print("*"); //print
            }
            System.out.println();
            
        }
    }
}
