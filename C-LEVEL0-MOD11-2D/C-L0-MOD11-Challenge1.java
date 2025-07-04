import java.util.*;


public class Solution 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int[][] arr= new int[m][n];    //int[] arr= new int[n];
        
        for(int i=0;i<m;i++)     //[1,n]
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();    //arr[i] = sc.nextInt();
            }
            
            
        }
        
        //second row ,second col
        
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int flag =0;
        
        int[][] arr2= new int[m1][n1];    //int[] arr= new int[n];
        
        for(int i=0;i<m1;i++)     //[1,n]
        {
            for(int j=0;j<n1;j++)
            {
                arr2[i][j]=sc.nextInt();    //arr[i] = sc.nextInt();
            }
            
            
        }
        
        if(m==m1 && n==n1)  //size 
        {
            //then
            
            
            for(int i=0;i<m1;i++)     //[1,n]
            {
            for(int j=0;j<n1;j++)
            {
                 if(arr[i][j] !=arr2[i][j])   //not again the size //i,j --->elements
                 {
                     flag = 1;
                     break; //
                 }
            }
               
        }
        }
        //simply
        else{
            System.out.print("NOT IDENTICAL");
            return;
        }
        
        if(flag ==0){
            System.out.print("IDENTICAL");
        }
        else{
            System.out.print("NOT IDENTICAL");
        }
    
        
        
    }
}
