import java.math.BigInteger;
/**
 * Solves Project Euler problem #25
 * https://projecteuler.net/problem=25
 * 
 * @author Jake Conway 
 * @version 1.0
 */
public class FourEight
{
    public static void main(String[] args)
    {
        BigInteger total = new BigInteger("0");
        for(int i = 1; i <= 1000; i++)
        {
            BigInteger j = new BigInteger(i + "");
            j = j.pow(i);
            total = total.add(j);
        }
        String out = total + "";
        System.out.println("Solution: " + out.substring(out.length()-10));
    }
}
