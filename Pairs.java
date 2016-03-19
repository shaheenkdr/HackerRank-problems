/**
 *https://www.hackerrank.com/challenges/pairs
 */

import java.io.*;
import java.util.*;

public class Pairs
{
    public static void main(String[] args)
    {
        Scanner sx = new Scanner(System.in);
        int n, num;
        n = sx.nextInt();
        num = sx.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sx.nextInt();
        }

        System.out.println(pairs(arr,num));
    }

    private static int pairs(int[] a, int diff_no)
    {
        int temp=0,result=0;
        HashMap<Integer,Boolean> hx = new HashMap<Integer,Boolean>();
        for(int i=0;i<a.length;i++)
            hx.put(a[i],true);

        for(int i=0;i<a.length;i++)
        {
            temp = a[i]+diff_no;
            if(hx.containsKey(temp))
                ++result;
        }
        return result;
    }
        
}



    
