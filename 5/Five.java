/**
 * Solves Project Euler problem #3
 * https://projecteuler.net/problem=3
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Five
{
    public static void main(String[] args)
    {
        boolean running = true;
        int counter = 1;
        while(running)
        {
            //Only ints 11-20 are included as ints 1-10 are all factors of 11-20, meaning that it's useless to check them
            if(counter%20 ==0 && counter%19 ==0 && counter%18 ==0 && counter%17 ==0 && counter%16 ==0 && counter%15 ==0 && counter%14 ==0 && counter%13 ==0 && counter%12 ==0 && counter%11 ==0)
            {
                System.out.println("Solution: " + counter);
                running = false;
            }
            counter++;
        }
    }
}
