/**
 * Solves Project Euler problem #9
 * https://projecteuler.net/problem=9
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Nine
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 1000; i++) 
        {
            for(int j = 1; j <=i+1; j++)
            {
                int a = i;
                int b = j;
                int c = 1000-(a+b);
                if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
                {
                    System.out.println("Solution: " + (a*b*c));
                }
            }
        }
    }
}
