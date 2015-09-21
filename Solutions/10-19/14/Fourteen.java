/**
 * Solves Project Euler problem #14
 * https://projecteuler.net/problem=14
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Fourteen
{
    public static void main(String[] args)
    {
        int max = 0;
        int biggestStart = 0;
        for(int i = 1; i <= 1000000; i++)
        {
            int out = getSequenceLength(i);
            if(out>max)
            {
                max = out;
                biggestStart = i;
            }
        }
        System.out.println("Solution: " + biggestStart);
    }
        /**
     * Returns the next long in a Collatz sequence
     * @param prev the previous term
     * @return the next term in a Collatz sequence
     */
    private static long getNext(long prev)
    {
        if(prev%2==0) //int is even
        {
            return prev/2;
        }
        else if(prev == 1)
        {
            return 1;
        }
        else //int is odd
        {
            return prev * 3 + 1;
        }
    }
    /**
     * Gets the number of terms in a Collatz sequence
     * @param start the starting number
     * @return the number of terms in a Collatz sequence
     */
    private static int getSequenceLength(int start)
    {
        long current = start;
        int counter = 1; //1 includes the start term
        while(current>1)
        {
            current = getNext(current);
            counter++;
        }
        return counter;
    }
}
