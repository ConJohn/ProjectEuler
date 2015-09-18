/**
 * Solves Project Euler problem #7
 * https://projecteuler.net/problem=7
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Seven
{
    public static void main(String[] args)
    {
        boolean run = true;
        int counter = 1; //set to 1 because 2 is an oddball case that the program won't detect.
        int num = 1;
        int greatest = 0;
        while(run)
        {
            boolean prime = false;
            for(int i = 2; i < num; i++)
            {
                if(num%i != 0)
                {
                    prime = true;
                }
                else
                {
                    prime = false;
                    break;
                }
            }
            if(prime == true)
            {
                counter++;
                greatest = num;
            }
            if(counter==10001)
            {
                System.out.println("Solution: " + greatest);
                run = false;
            }
            num++;
        }
    }
}
