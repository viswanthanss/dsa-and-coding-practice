/******************************************************************************

tinyurl.com/kits-demodb
karunya_dept  (department) eee ece aids 

*******************************************************************************/
import java.util.*;
public class Main       //  a n 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int [][][]a = new int[2][n][n];
	int col,row,sheet;
	
	for(sheet=0;sheet<2;sheet++)
	for(row=0;row<n;row++)
	{
	for(col=0 ;col<n ; col++)
	{
	    a[sheet][row][col] = sc.nextInt();
	}
	}
	
	
		for(sheet=0;sheet<2;sheet++)
	for(row=0;row<n;row++)
	{
	for(col=0 ;col<n ; col++)
	{
	   System.out.print(a[sheet][row][col]+" ");
	}
	System.out.println();
	
	}
	}
}






/*
1D 2D MD 
Array    11  22 33 44 55 

1 2 3 
4 5 6 

1 2          5 6 
3 4          7 8 


n = 4 
1 2 3 4 
3 4 5 6 
6 7 8 9 
3 4 5 6 

1D 2D  MD  Array 
https://onlinegdb.com/Gu69Q5Qa9

*/


import java.util.*;
public class Main       //  a n 
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int [][]a = new int[r1][c1];
    
    int col,row,flag=0;
    
    
    for(row=0;row<r1;row++)
    {
    for(col=0 ;col<c1 ; col++)
    {
        a[row][col] = sc.nextInt();
    }
        
    }
        
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int [][]a1 = new int[r2][c2];
    
    
    
    
    for(row=0;row<r2;row++)
    {
    for(col=0 ;col<c2 ; col++)
    {
        a1[row][col] = sc.nextInt();
    }
    }
    if(r1==r2 &&  c1==c2)
    for(row=0;row<r2;row++)   // check 
    {
    for(col=0 ;col<c2 ; col++)
    {
       if(a1[row][col] !=  a[row][col])
       {
           flag = 1;
           break;
       }
    }
    }
        else{
            System.out.print("NOT IDENTICAL");
            return ;
        }
        
        
        if(flag == 0)
            System.out.print("IDENTICAL");
    else
            System.out.print("NOT IDENTICAL");
        
    
      
    }
}



import java.util.*;
public class Main       //  a n 
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int n = sc.nextInt();
    int [][]a = new int[n][n];
    
    int col,row,count=0 ,max  =0 ,index=-1;
    
    
    for(row=0;row<n;row++)
    {
        count=0;
    for(col=0 ;col<n ; col++)
    {
        a[row][col] = sc.nextInt();
        if(a[row][col]==0)
        {
            count++;
        }
    }
        if(count > max )
        {
            max = count;
            index = row;
        }
        
    }
     if(index==-1)
           System.out.print("No row has zeros");
        else
        System.out.print(index);
      
    }
}



