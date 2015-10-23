/**
 * Solves Project Euler problem #12
 * https://projecteuler.net/problem=12
 * 
 * @author Jake Conway
 * @version 1.1
 */
public class Twelve
{
    public static void main(String[] args)
    {
        boolean running = true;
        long next = 1L;
        long prevTri = 0;
        while(running)
        {
            long triangle = prevTri + next;
            prevTri += next;
            int divisors = numDivisors(triangle);
            if(divisors >= 500)
            {
                System.out.println("Solution: " + triangle);
                running = false;
            }
            next++;
        }
    }   

    private static int numDivisors(long t)
    {
        int divisors = 0;
        long max = (long) Math.sqrt(t);
        for(int j = 1; j <= max; j++)
        {
            if(t%j == 0)
            {
                divisors+=2;
            }
        }
        if(Math.pow(max, 2) == t)
        {
            divisors--;
        }
        return divisors;
    }
}
