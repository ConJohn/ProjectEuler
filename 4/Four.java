/**
 * Solves Project Euler problem #4
 * https://projecteuler.net/problem=4
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Four
{
    public static void main(String[] args)
    {
        int largest = 0;
        int x = 0;
        int y = 0;
        for(int i = 100; i <= 999; i++)    
        {
            for(int j = 100; j <= 999; j++)
            {
                int t = i * j;
                if(t == reverse(t) && t > largest)
                {
                    largest = t;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Solution: " + largest + " (" + x + " * " + y + ")"); 
    }
    
    /**
     * Reorders the the numerals in an int to become the backwards version of the int (example 987 -> 789)
     * @param x the int
     */
    private static int reverse(int x)
    {
        String s = "" + x;
        return Integer.parseInt(reverseString(s));
    }
    
    /**
     * Reorders a String to become a backwards version of the original using recursion
     * @param s the String
     */
    private static String reverseString(String s)
    {
        if(s.length()==0){return s;}
        else{return reverseString(s.substring(1)) + s.substring(0, 1);}
    }
}
