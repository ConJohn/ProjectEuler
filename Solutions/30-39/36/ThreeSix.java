/**
 * Solves Project Euler problem #36
 * https://projecteuler.net/problem=36
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class ThreeSix
{
    public static void main(String[] args)
    {
        long sum = 0;
        for(int i = 0; i < 1000000; i++)
        {
            if(isPalindrome(i) && isPalindrome(Integer.toBinaryString(i)))
            {
                sum+= i;
            }
        }
        System.out.println("Solution: " + sum);
    }
    
    /**
     * Checks if a given int is a palindromic number
     * @param n the integer
     * @return whether the int is a palindrome
     */
    public static boolean isPalindrome(int n)
    {
        String o = n + "";
        String r = "";
        for(int i = o.length()-1; i >=0; i--)
        {
            r += o.charAt(i);
        }
        if(o==r)
        {
            return true;
        }
        return Integer.parseInt(o)==Integer.parseInt(r);
    }
    
    /**
     * Checks if a given String is a palindrome
     * @param n the String
     * @return whether the String is a palindrome
     */
    public static boolean isPalindrome(String n)
    {
        String o = n;
        String r = "";
        for(int i = o.length()-1; i >=0; i--)
        {
            r += o.charAt(i);
        }
        if(o==r)
        {
            return true;
        }
        return o.equals(r);
    }
}
