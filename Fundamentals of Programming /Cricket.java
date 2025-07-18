import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int totalBallsformat = sc.nextInt();
        int totalteamruns = sc.nextInt();
        int crruns= sc.nextInt();
        int ballsbowledtill = sc.nextInt();
        
        int totalOversformat = totalBallsformat /6;
        double oversfinishedtill = (ballsbowledtill/6) + ((ballsbowledtill %6) /10.0);
        
        double crrate = crruns / oversfinishedtill;
        double nettotalrunrate = (double) totalteamruns / totalOversformat;
        
        System.out.println(totalOversformat);
        System.out.println(oversfinishedtill);
        System.out.printf("%.1f\n",crrate);
        System.out.printf("%.1f\n",nettotalrunrate);
        
        if(crrate > nettotalrunrate){
            System.out.println("Eligible to Win");
            
        }else{
            System.out.println("Not Eligible to Win");
            
        }
        
    }
}
