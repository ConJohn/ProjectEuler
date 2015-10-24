import java.util.ArrayList;
import java.math.BigInteger;
/**
 * Solves Project Euler problem #20
 * https://projecteuler.net/problem=20
 * 
 * @author Jake Conway 
 * @version 1.0
 */
public class TwentyNine
{
    public static void main(String[] args)
    {
        ArrayList<BigInteger> outputs = new ArrayList<BigInteger>();
        for(int i = 2; i <= 100; i++)
        {
            for(int j = 2; j <= 100; j++)
            {
                BigInteger pow = BigInteger.valueOf(i).pow(j);
                if(!outputs.contains(pow))
                {
                    outputs.add(pow);
                }
            }
        }
        System.out.println("Solution: " + outputs.size());
    }
}
