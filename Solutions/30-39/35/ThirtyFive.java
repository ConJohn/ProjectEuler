/**
 * Solves Project Euler problem #35
 * https://projecteuler.net/problem=35
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class ThirtyFive
{
    public static void main(String[] args)
    {
        java.util.ArrayList<Integer> nums = new java.util.ArrayList<Integer>();
        for(int i = 0; i <=1000000; i++)
        {
            if(isCircular(i))
            {
                nums.add(i);
            }
        }
        nums.remove(0); //remove 0 and 1 since they aren't valid
        nums.remove(0);
        
        System.out.println("Solution: " + nums.size());
    }

    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++) 
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isCircular(int n)
    {
        int temp = n;
        String asNum = n + "";
        int len = asNum.length();
        int current = n;
        if(!isPrime(n))
        {
            return false;
        }
        for(int i = 0; i < len; i++)
        {
            String r = (current + "").substring(asNum.length()-1) + (current + "").substring(0,asNum.length()-1);
            current = Integer.parseInt(r);
            if(!isPrime(current))
            {
                return false;
            }
        }
        return true;
    }   
}
