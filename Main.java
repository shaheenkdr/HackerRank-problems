import java.io.*;
import java.util.*;

public class Main 
{
    private static boolean flag;
    private static int count;

    public static void main(String[] args) 
    {
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        count = 0;
        int temp=0,pos=0;
        String[] data = new String[n];
        for(int i=0;i<n;i++)
        {
            data[i] = dup_rem(sx.next());
            if(data[i].length()>temp)
            {
                temp = data[i].length();
                pos = i;
            }
        }
            

        char[] vals = data[pos].toCharArray();
        for(int i=0;i<vals.length;i++)
        {
            flag = false;
            for(int j=1;j<n;j++)
            {
                if(data[j].contains(String.valueOf(vals[i])))
                {
                    flag = true;
                    continue;
                }
                    
                else
                {
                    flag = false;
                     break;
                }
                   
            }
            if(flag)
                ++count;
        }
        System.out.println(count); 
    }

    private static String dup_rem(String x)
    {
        char[] a = x.toCharArray();
        LinkedHashSet<Character> dup = new LinkedHashSet<Character>();
        
        for(char c: a)
            dup.add(c);
        StringBuilder sample = new StringBuilder();

        for(Character text:dup)
            sample.append(text);
        return sample.toString();
    }
}