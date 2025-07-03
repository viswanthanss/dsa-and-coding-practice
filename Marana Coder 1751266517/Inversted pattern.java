import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row ,space, col , val=1 , val1 ;
        int total = n* (n+1);
        
        for(row=n;row>=1 ; row--)
        {
            total = total - row;
            val1 = total;
            for(space=1;space<=n-row;space++)
                   System.out.print("--");
            for(col =1 ; col<=row  ; col++)
            {
                System.out.print(val+"*");
                val++;
            }
            
            for(col =1 ; col<=row-1  ; col++)
            {
                val1++;
                System.out.print(val1+"*");
                
            }
            val1++;
                System.out.print(val1);
            System.out.println();
                
        }
    }
}

/*
n = 4 

   1 2 3 4 
4  1*2*3*4*17*18*19*20
3  --5*6*7*14*15*16
2  ----8*9*12*13
1  ------10*11


total = n * (n+1)   - row 
val = total //  16 
*/




----------------------------------------------------------------------




  import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int row ,space , star; 
        for(row = n ; row>=1; row--) // lower 
        {
        for(space=1 ;space <=n-row ; space++)
        {
            System.out.print(" ");
        }
                
        // for(star = 1 ;star <= 2*row-1 ; star++)
        for(star = 1 ;star <= 2*row-1 ; star++)  //stars to print formula 
        {
            System.out.print("*");
        }
        System.out.println();
            
    }
    }
}
