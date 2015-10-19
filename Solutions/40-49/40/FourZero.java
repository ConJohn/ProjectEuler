/**
 * Solves Project Euler problem #40
 * https://projecteuler.net/problem=40
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class FourZero
{
    public static void main(String[] args)
    {
        String nums = "";
        int i = 1;
        int n = 0;
        int prevLength = 0;
        String[] num = new String[100];
        while(n < 100)
        {
            nums += i;
            i++;
            if(i%10000==0)
            {
                num[n] = nums;
                nums = "";
                n++;
            }
        }
        nums = "";
        for(String x : num)
        {
            nums += x;
        }
        double total = Integer.parseInt(nums.substring(0,1)) * Integer.parseInt(nums.substring(9,10)) * Integer.parseInt(nums.substring(99,100)) * Integer.parseInt(nums.substring(999,1000))  * Integer.parseInt(nums.substring(9999,10000)) * Integer.parseInt(nums.substring(99999,100000)) * Integer.parseInt(nums.substring(999999,1000000));
        System.out.println("Solution: " + total);
    }
}
