
import java.util.*;

public class Solution{
    public static void main(String[] args){
        
        
    Scanner sc=  new Scanner(System.in);
    
    int d1= sc.nextInt();
    int c1= sc.nextInt();
    int d2 = sc.nextInt();
    int c2 = sc.nextInt();
    
    int td = d1 + d2;
    int tc= c1+c2;
    
    td += tc / 100;  //adding extra additional dollars from total cents 
    tc = tc % 100;
    
    System.out.println(td);
    System.out.println(tc);
        
    }
    
    
}
