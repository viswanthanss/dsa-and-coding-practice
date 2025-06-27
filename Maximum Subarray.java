import java.util.*;  // for Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // input reader

        int n = sc.nextInt();         // read size
        int[] arr = new int[n];       // create array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    // read elements
        }

        int max_sum = arr[0];         // to store final answer
        int current_sum = arr[0];     // running sum

        for (int i = 1; i < n; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);  // choose better
            max_sum = Math.max(max_sum, current_sum);              // update max
        }

        System.out.print(max_sum);    // ✅ print only once, after loop
    }
}

Approach  2:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int []a = new int[size];
	int i,j,max = 0,sum=0;
	for(i=0;i<size;i++)
	{
	   a[i] = sc.nextInt();   
	}
	
	max = 0 ;
for(i=0;i<size;i++)
{
    for(j=i;j<size;j++)
    {
        sum = sum + a[j];
        if(max < sum)
        {
            max = sum;
        }
    }
    sum = 0;
}

System.out.println(max);
	
	
	}
}




/*
6

1 -3 4 2 -4 5

1 -3 4 2 -4 5   =   5 
4 2 -4 5        = 7 
max = 5 
max = 0 
for(i=0;i<s;i++)
{
    for(j=i;j<s;j++)
    {
        sum = sum + a[j];
        if(max < sum)
        {
            max = sum;
        }
    }
    sum = 0;
}

7
0 1  2 3 4  5 6 
4 3 -6 7 4 -1 2

4 = 4 
4 3  = 7
4 3 -6 = 1 
4 3 -6 7 = 8 
4 3 -6 7 4 = 12 
4 3 -6 7 4 -1 = 11 
4 3 -6 7 4 -12 = 13 



 3  = 3
 3 -6 = -3 
 3 -6 7 = 4 
 3 -6 7 4 = 8 
 3 -6 7 4 -1 = 7 
 3 -6 7 4 -1 2 = 9 






*/

