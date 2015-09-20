import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.math.BigInteger;
/**
 * Solves Project Euler problem #13
 * https://projecteuler.net/problem=13
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Thirteen
{
    public static void main(String[] args)
    {
        ArrayList<BigInteger> nums = new ArrayList<BigInteger>();
        try
        {
            Scanner s = new Scanner(new File("Numbers.txt"));
            while(s.hasNextLine())
            {
                nums.add(new BigInteger(s.nextLine()));
            }
        }
        catch(FileNotFoundException f)
        {
            System.err.println("Error: File not found!");
        }
        BigInteger total = new BigInteger(0 + "");
        for(BigInteger l : nums)
        {
            total = total.add(l);
        }
        String num = total.toString();
        System.out.println("Solution:" + num.substring(0,10));
    }
}
