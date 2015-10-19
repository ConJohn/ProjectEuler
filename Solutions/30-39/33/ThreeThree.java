/**
 * Solves Project Euler problem #33
 * https://projecteuler.net/problem=3
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class ThreeThree
{
    public static void main(String[] args)
    {
        int totalTop = 1;
        int totalBottom = 1;
        for(double i = 11; i < 100; i++)
        {
            for(double j = 11; j < i; j++)
            {
                if(i%10!=0||j%10!=0)
                {
                    String top = j + "";
                    String bottom = i + "";
                    if(bottom.charAt(0) == top.charAt(1))
                    {
                        if(Double.parseDouble(top.charAt(0)+"") / Double.parseDouble(bottom.charAt(1)+"") == j/i)
                        {
                            totalTop *= j;
                            totalBottom *= i;
                        }
                    }
                    else if(bottom.charAt(1) == top.charAt(0))
                    {
                        if(Double.parseDouble(top.charAt(1)+"") / Double.parseDouble(bottom.charAt(0)+"") == j/i)
                        {
                            totalTop *= j;
                            totalBottom *= i;
                        }
                    }
                }
            }
        }
        int LCM = getLCM (totalTop, totalBottom);
        System.out.println("Solution: " + totalBottom/LCM);
    }
    
    /**
     * Calculates the LCM of two numbers
     * @param a the first number
     * @param b the second number
     * @return the LCM of the two numbers
     */
    private static int getLCM(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return getLCM(b, a%b);
        }
    }
}
