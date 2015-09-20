import java.util.ArrayList;
/**
 * Solves Project Euler problem #10
 * https://projecteuler.net/problem=10
 * 
 * @author Jake Conway
 * @version 1.0
 */
 
public class Ten
{
    public static void main(String[] args)
    {
        long total = 1L; //Starts with 3 since 1 is an oddball prime
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for(int i = 1; i < 2000000; i+=2)
        {
            String s = i + "";
            String st = s.substring(s.length()-1);

            boolean prime = true;
            
            if(st=="5" &&s.length()>1)
            {
                prime = false;
            }
            
            if(i < 10000 &&st!="7")
            {
                for(int j : primes)
                {
                    if(i%j ==0)
                    {
                        prime = false;
                    }
                    if(prime == false){break;}
                }
            }
            if(prime && st !="7")
            {
                for(int k = 2; k < i - 1; k++)
                {
                    if(i%k ==0)
                    {
                        prime = false;
                        primes.add(i); //adds nonprimes to the array to be checked
                        break;
                    }
                    if(prime == false){break;}
                }
            }
            if(prime)
            {
                total += i;
            }
        }
        System.out.println("Solution: " + total);
    }
}
