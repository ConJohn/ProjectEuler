import java.util.Calendar;
import java.util.Date;
/**
 * Solves Project Euler problem #19
 * https://projecteuler.net/problem=19
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Nineteen
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        int counter = 0;
        for(int i = 1901; i <= 2000; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                c.set(i, j, 1);
                int dow = c.get(Calendar.DAY_OF_WEEK);
                if(dow == 1)
                {
                    counter++;
                }
            }
        }
        System.out.println("Solution: " + counter);
    }
}
