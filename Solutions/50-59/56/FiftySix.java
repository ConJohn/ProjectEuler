import java.math.BigInteger;
/**
 * Solves Project Euler problem #56
 * https://projecteuler.net/problem=56
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class FiftySix
{
    public static void main(String[] args)
    {
        int biggestSum = 0;
        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j < 100; j++)
            {
                BigInteger bi = new BigInteger(i+"");
                bi = bi.pow(j);
                int sum = sum(bi);
                if(sum>biggestSum)
                {
                    biggestSum = sum;
                }
            }
        }
        
        System.out.println("Solution: " + biggestSum);
    }
    
    /**
     * Calculates the sum of all the digits in a BigInteger
     * @param bi a BigInteger
     * @return the total of all the digits in the BigIntger
     */
    public static int sum(BigInteger bi)
    {
        String num = bi.toString();
        int total = 0;
        for(int i = 0; i < num.length(); i++)
        {
            total += Integer.parseInt(num.substring(i, i+1));
        }
        return total;
    }
}
