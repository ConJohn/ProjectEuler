import java.math.BigInteger;
/**
 * Solves Project Euler problem #20
 * https://projecteuler.net/problem=20
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Twenty
{
    public static void main(String[] args)
    {
        BigInteger out = new BigInteger(1 +"");
        for(int i = 100; i > 0; i--)
        {
            out = out.multiply(new BigInteger(i + ""));
        }
        String s = out.toString();
        long sum = 0;
        for(int j = 0; j < s.length(); j++)
        {
         sum += Integer.parseInt(s.charAt(j) + "");   
        }
        System.out.println("Solution: " + sum);
    }
}
