
import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        String x = sc.nextLine();
        
        boolean isNeg = false;
        
        if(x.charAt(0) == '-'){
            isNeg= true;              //isNeg
            x=x.substring(1);   //Skip index 0, and start from index 1”
        }
        
        String reversed = new StringBuilder(x).reverse().toString();
        
        if(isNeg){
            
            reversed = "-" + reversed;    //reversed
            
        }
        try{
            int answer;
            
            answer = Integer.parseInt(reversed);
            System.out.println(answer);         //ln
            
        }catch (Exception e){          //catch(Exception e){}
            System.out.println(0);
        }
        
    }
}
