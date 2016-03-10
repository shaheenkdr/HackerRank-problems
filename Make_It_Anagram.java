import java.io.*;
import java.util.*;

public class Main 
{
  private static char[] A,B;
  private static int i,j,count=0,index=0;
  public static void main(String[] args) 
  { 
    Scanner sx = new Scanner(System.in);
    A = sx.next().toCharArray();
    B = sx.next().toCharArray();
    sx.close();
    if(A.length>B.length)
    {
      Arrays.sort(A);
      for(i=0;i<B.length;i++)
      {
        index = Arrays.binarySearch(A,B[i]);
        if(index!=-1)
        {
          try{
          while(index<A.length-1)
          {
            A[index] = A[index+1];
            ++index;
          }
          A[A.length-1] = 999;
          ++count;
        }catch(Exception e){}
        }
      } 

    }
    else
    {
      Arrays.sort(B);
      for(i=0;i<A.length;i++)
      {
        index = Arrays.binarySearch(B,A[i]);
        if(index!=-1)
        {
          try{
          while(index<B.length-1)
          {
            B[index] = B[index+1];
            ++index;
          }
          B[B.length-1] = 999;
          ++count;
        }
        catch(Exception e){}
        }
      }
    }

    final int score = (A.length-count)+(B.length-count);
    System.out.println(score);
  }

}
