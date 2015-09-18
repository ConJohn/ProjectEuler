/**
 * Solves Project Euler problem #6
 * https://projecteuler.net/problem=6
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Six
{
    public static void main(String[] args)
    {
        int totalSq = 0;
        int totalAd = 0;
        for(int i = 1; i <=100; i++)
        {
            totalSq += Math.pow(i, 2);
            totalAd += i;
        }
        totalAd = (int) Math.pow(totalAd, 2);
        System.out.println("Solution: " + (totalAd-totalSq));
    }
}
