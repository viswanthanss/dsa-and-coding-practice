class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        int sqrt = (int) Math.sqrt(num);   // find square root
        if (sqrt * sqrt == num) 
        {          // check if square matches num
            return true;
        } else
        {
            return false;
        }
    }
}
