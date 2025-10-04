import java.util.Random;

public class RandomNumberGenerator
{
    public static void main(String[] args) 
    {
        
        Random r = new Random();
        
        
        int num = r.nextInt(100);  // generates a number between 0 and 99
        int num1 = r.nextInt(999);
        
        System.out.println(num);
        System.out.println(num1);
    }
}
