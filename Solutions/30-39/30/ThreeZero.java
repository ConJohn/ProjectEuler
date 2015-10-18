import java.util.ArrayList;
/**
 * Solves Project Euler problem #30
 * https://projecteuler.net/problem=30
 * 
 * @author Jake Conway 
 * @version 1.0
 */
public class ThreeZero
{
    public static void main(String[] args)
    {
        long total = -1; //ProjectEuler says 1 doesn't count, so this -1 accounts for the +1
        for(long i = 0L; i < 6*Math.pow(9,5); i++)
        {
            ArrayList<Integer> digits = new ArrayList<Integer>();
            String num = i + "";
            for(int j = 0; j < num.length(); j++)
            {
                digits.add(Integer.parseInt(num.substring(j, j+1)));
            }
            long totalTemp = 0;
            for(int d : digits)
            {
                totalTemp+= Math.pow(d, 5);
            }
            if(totalTemp==i)
            {
                total+=i;
            }
        }
        System.out.println("Solution: " + total);
    }
}
