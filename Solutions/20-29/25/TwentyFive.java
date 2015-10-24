import java.math.BigInteger;
/**
 * Solves Project Euler problem #25
 * https://projecteuler.net/problem=25
 * 
 * @author Jake Conway 
 * @version 1.0
 */
public class TwentyFive
{
    public static void main(String[] args)
    {
        int term = 2; //2 accounts for the first 2 digits since this program doesn't calculate those.
        boolean found = false;
        BigInteger target = new BigInteger("10");
        target = target.pow(999);
        BigInteger prev1 = new BigInteger("0");
        BigInteger prev2 = new BigInteger("1");
        BigInteger cur = new BigInteger("1");
        while(!found)
        {
            term++;
            prev1 = new BigInteger(prev2 + "");
            prev2 = new BigInteger(cur+"");
            cur = cur.add(prev1);
            if(cur.compareTo(target)>=0)
            {
                System.out.println("Solution: " + term);
                found = true;
            }
        }
    }
}
