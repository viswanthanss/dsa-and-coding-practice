import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the string 1:");
		String a= sc.next();
		
		System.out.println("Enter the string 2:");
		String b= sc.next();
		
		a= a.toLowerCase();
		b= b.toLowerCase();
		
// 		Arrays.sort(a);
// 		Arrays.sort(b);
		
		if(a.length() == b.length())  //if
		{
		    char [] c = a.toCharArray();
		    char [] d = b.toCharArray();
		    
		    Arrays.sort(c);
		    Arrays.sort(d);
		    
		  //  System.out.print(c);
		  //  System.out.print(d);
		    
		    if(Arrays.equals(c,d))
		    {
		        System.out.print("Anagram");
		    }else
		    {
		        System.out.print("Invalid");
	    	}
		    
		}
		//else
		else
		{
		    System.out.print("Invalid");
		}
		
		
	

	}
}
