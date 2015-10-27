import java.util.Arrays;
/**
 * Solves Project Euler problem #52
 * https://projecteuler.net/problem=52
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class FiftyTwo
{
    public static void main(String[] args)
    {
        long counter = 1;
        boolean running = true;
        while(running)
        {
            if(meetsRules(counter))
            {
                System.out.println("Solution: " + counter);
                running = false;
            }
            else
            {
                counter++;
            }
        }
    }

    /**
     * determines if a number meets the rules of the problem
     * @param n the number
     * @return whether it meets the rules
     */
    private static boolean meetsRules(long n)
    {
        long two, three, four, five, six;
        two = 2 * n;
        three = 3 * n;
        four = 4 * n;
        five = 5*n;
        six = 6*n;
        return hasSameDigits(n, two) && hasSameDigits(n, three) && hasSameDigits(n, four) && hasSameDigits(n, five) && hasSameDigits(n, six); 
    }

    /**
     * determines if 2 longs have the same digits (in a different order)
     * @param x the first long
     * @param y the second long
     * @return whether they have the same long
     */
    private static boolean hasSameDigits(long x, long y)
    {
        String xx = x + "";
        String yy = y + "";
        char[] nO = xx.toCharArray();
        char[] nT = yy.toCharArray();
        Arrays.sort(nO);
        Arrays.sort(nT);
        return Arrays.equals(nO, nT);
    }
}
