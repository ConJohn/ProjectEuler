import java.math.BigInteger;
/**
 * Solves Project Euler problem #16
 * https://projecteuler.net/problem=16
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Sixteen
{
    public static void main(String[] args)
    {
        long two = 2; 
        BigInteger b = new BigInteger(two + "");
        BigInteger total = new BigInteger("1");
        total = b.pow(1000);
        String raw = total + "";
        int out = 0;
        for(int i = 0; i < raw.length(); i++)
        {
            int temp = Integer.parseInt(raw.substring(i,i+1));
            out += temp;
        }
        System.out.println("Solution: " + out);
    }
}
