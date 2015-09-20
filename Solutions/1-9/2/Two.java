import java.util.ArrayList;
/**
 * Solves Project Euler problem #2
 * https://projecteuler.net/problem=2
 * 
 * @author Jake Conway 
 * @version 1.0
 */
public class Two
{
    public static void main(String[] args)
    {
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(2);
        int element = 1;
        int total = 2; //start with 2 to account for the 2 already in the ArrayList
        while(fib.get(fib.size()-1)<4000000)
        {
            fib.add(fib.get(element) + fib.get(element-1));
            if(fib.get(fib.size()-1)%2==0)
            {
                total+=fib.get(fib.size()-1);
            }
            fib.remove(0);
        }
        System.out.println("Solution: " + total);
    }
}
