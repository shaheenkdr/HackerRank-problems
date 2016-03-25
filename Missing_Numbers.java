/**
 *https://www.hackerrank.com/challenges/missing-numbers/
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;

public class Main
{
    private static HashMap<Integer,Integer> NumList;
    private static TreeSet<Integer> set_of_num;
    private static int i,n,m,temp;
    public static void main(String[] args)
    {
        Scanner sx = new Scanner(System.in);
        NumList = new HashMap<Integer,Integer>();
        set_of_num = new TreeSet<Integer>();
        n = sx.nextInt();
        for(i=0;i<n;i++)
        {
            temp = sx.nextInt();
            if(NumList.containsKey(temp))
            {
                NumList.put(temp,NumList.get(temp)+1);
            }
            else
            {
                NumList.put(temp,1);
            }
        }
        m = sx.nextInt();
        for(i=0;i<m;i++)
        {
            temp = sx.nextInt();
            if(NumList.containsKey(temp))
            {
                if(NumList.get(temp)<=0)
                    set_of_num.add(temp);
                else
                    NumList.put(temp,NumList.get(temp)-1);
            }
            else
            {
                set_of_num.add(temp);
            }
        }
        for(Integer x: set_of_num)
            System.out.printf("%d ",x);
    }
}


    
