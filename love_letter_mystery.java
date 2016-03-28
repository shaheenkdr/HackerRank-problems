/**
 * https://www.hackerrank.com/challenges/the-love-letter-mystery/
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sx = new Scanner(System.in);
        int T = sx.nextInt();
        StringBuilder data = new StringBuilder();
        for(int i=0;i<T;i++)
        {
            data.setLength(0);
            data.append(sx.next());
            char[] char_form = data.toString().toCharArray();
            int count = 0;
            for(int x=0,y=char_form.length-1;x<y;x++,y--)
            {
                if(char_form[x]!=char_form[y])
                {
                    count+= Math.abs(char_form[x]-char_form[y]);
                }
            }
            System.out.println(count);
        }
    }
}
