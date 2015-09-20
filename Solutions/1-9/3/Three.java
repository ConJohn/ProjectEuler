/**
 * Solves Project Euler problem #3
 * https://projecteuler.net/problem=3
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Three
{
    public static void main(String[] args)
    {
        long num = 600851475143L;
        long biggestFactor = 0L;
        for(int i = 2; i <= num; i++)
        {
            while(num%i==0)
            {
                num /= i;
                biggestFactor = i;
            }
        }
        System.out.println("Solution: " + biggestFactor);
    }   
}
