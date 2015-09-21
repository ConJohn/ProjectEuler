/**
 * Solves Project Euler problem #17
 * https://projecteuler.net/problem=17
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class Seventeen
{
    public static void main(String[] args)
    {
        int[] numbers = new int[1001];
        for(int i = 1; i <= 1000; i++)
        {
            numbers[i] = i;
        }
        String out = "";
        for(int i : numbers)
        {
            if(i < 21)
            {
                out += getSingleWord(i);
            }
            else if(i >= 21 && i < 100)
            {
                out += getDoubleWord(i);
            }
            else if(i >= 100 && i < 1000)
            {
                out += getTripleWord(i);
            }
            else
            {
                out += getQuadrupleWord(i);
            }
        }
        System.out.println("Solution: " + out.length());
    }

    /**
     * Returns the word for any 1 word number (i.e. numbers 0-20)
     * @param n the number
     * @return the word format of n
     */
    
    private static String getSingleWord(int n)
    {
        switch(n)
        {
            case 0:
            return "";
            case 1:
            return "one";
            case 2:
            return "two";
            case 3:
            return "three";
            case 4:
            return "four";
            case 5:
            return "five";
            case 6:
            return "six";
            case 7:
            return "seven";
            case 8:
            return "eight";
            case 9:
            return "nine";
            case 10:
            return "ten";
            case 11:
            return "eleven";
            case 12:
            return "twelve";
            case 13:
            return "thirteen";
            case 14:
            return "fourteen";
            case 15:
            return "fifteen";
            case 16:
            return "sixteen";
            case 17:
            return "seventeen";
            case 18:
            return "eighteen";
            case 19:
            return "nineteen";
            case 20:
            return "twenty";
        }
        return "";
    }

    /**
     * Returns the word for any number with 2 digits
     * @param n the number
     * @return the word format of n
     */
    private static String getDoubleWord(int n)
    {
        if(n > 0 && n <= 20)
        {
            return getSingleWord(n);
        }
        else if(n > 20 && n < 30)
        {
            String num = n + "";
            return "twenty" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 30 && n < 40)
        {
            String num = n + "";
            return "thirty" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 40 && n < 50)
        {
            String num = n + "";
            return "forty" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 50 && n < 60)
        {
            String num = n + "";
            return "fifty" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 60 && n < 70)
        {
            String num = n + "";
            return "sixty" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 70 && n < 80)
        {
            String num = n + "";
            return "seventy" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 80 && n < 90)
        {
            String num = n + "";
            return "eighty" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        else if(n >= 90 && n < 100)
        {
            String num = n + "";
            return "ninety" + getSingleWord(Integer.parseInt(num.substring(1)));
        }
        return "";
    }

    /**
     * Returns the word for any number with 3 digits
     * @param n the number
     * @return the word format of n
     */
    private static String getTripleWord(int n)
    {
        if(n % 100 == 0)
        {
            String num = n + "";
            return getSingleWord(Integer.parseInt(num.substring(0,1))) + "Hundred";
        }
        else if(n > 100 && n < 1000)
        {
            String num = n + "";
            return getSingleWord(Integer.parseInt(num.substring(0,1))) + "HundredAnd" + getDoubleWord(Integer.parseInt(num.substring(1)+""));
        }
        return "";
    }

    /**
     * Returns the word for 1000
     * @param n the number
     * @return the word format of n
     */
    private static String getQuadrupleWord(int n)
    {
        return "oneThousand";
    }
}
