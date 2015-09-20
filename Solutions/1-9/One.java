/**
 * Solves Project Euler problem #1
 * https://projecteuler.net/problem=1
 * 
 * @author Jake Conway
 * @version 1.0
 */
 
public class One
{
    public static void main(String[] args)
    {
        int total = 0;
        for(int i = 0; i < 1000; i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                total += i;
            }
        }
        System.out.println("Solution: " + total);
    }
}
