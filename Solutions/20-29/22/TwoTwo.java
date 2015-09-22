import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Collection;
import java.text.Collator;
import java.math.BigInteger;
import java.util.Collections;
/**
 * Solves Project Euler problem #22
 * https://projecteuler.net/problem=22
 * 
 * @author Jake Conway
 * @version 1.0
 */
public class TwoTwo
{
    public static void main(String[] args)
    {
        String names = getNames();
        boolean running = true;
        Collection<String> name = new TreeSet<String>(Collator.getInstance());
        while(names.length()>1)
        {
            if(names.indexOf(",")!=-1)
            {
                name.add(names.substring(1, names.indexOf(",") - 1));
                names = names.substring(names.indexOf(",")+1);
            }
            else
            {
                names = "";
            }
        }
        BigInteger total = new BigInteger("0");
        ArrayList<String> na = new ArrayList<String>(name);
        for(int i = 0; i < name.size(); i++)
        {
            total = total.add(new BigInteger("" + (letterScore(na.get(i)) * (i+1))));
        }
        System.out.println("Solution: " + total);
    }

    private static int letterScore(String x)
    {
        String in = x.toLowerCase();
        int total = 0;
        for(int i = 0; i < x.length(); i++)
        {
            String temp = in.substring(i,i+1);
            switch(temp)
            {
                case "a":
                total += 1;
                break;
                case "b":
                total += 2;
                break;
                case "c":
                total += 3;
                break;
                case "d":
                total += 4;
                break;
                case "e":
                total += 5;
                break;
                case "f":
                total += 6;
                break;
                case "g":
                total += 7;
                break;
                case "h":
                total += 8;
                break;
                case "i":
                total += 9;
                break;
                case "j":
                total += 10;
                break;
                case "k":
                total += 11;
                break;
                case "l":
                total += 12;
                break;
                case "m":
                total += 13;
                break;
                case "n":
                total += 14;
                break;
                case "o":
                total += 15;
                break;
                case "p":
                total += 16;
                break;
                case "q":
                total += 17;
                break;
                case "r":
                total += 18;
                break;
                case "s":
                total += 19;
                break;
                case "t":
                total += 20;
                break;
                case "u":
                total += 21;
                break;
                case "v":
                total += 22;
                break;
                case "w":
                total += 23;
                break;
                case "x":
                total += 24;
                break;
                case "y":
                total += 25;
                break;
                case "z":
                total += 26;
                break;
            }
        }
        return total;
    }

    /**
     * Converts the .txt file to one long String
     * @return one long String containing the entire .txt file
     */
    private static String getNames()
    {
        File f = new File("names.txt");
        StringBuilder sb = new StringBuilder((int) f.length());
        try 
        {
            Scanner s = new Scanner(f);
            String ls = System.getProperty("line.separator");
            while(s.hasNextLine()) 
            {        
                sb.append(s.nextLine() + ls);
            }
            return sb.toString();
        } 
        catch(FileNotFoundException fnfe)
        {
            System.err.println("Error! File not found.");
        }
        return "";
    }
}
