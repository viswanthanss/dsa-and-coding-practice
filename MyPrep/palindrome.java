import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        String a = sc.nextLine();
        
        int n=a.length();
        
        for(int i=0;i<n;i++){
            
            if(a.charAt(i) != a.charAt(n-1-i)){
                System.out.println(0);
                return ;
                
            }
        }
        System.out.println(1);
    }
}
