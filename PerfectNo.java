// perfect no in which number equals to sum of factor of that number ex.28

import java.util.*;
import java.io.*;
class PerfectNo
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    int sum=0;
    for(int i=1;i<=in/2;i++)
    {
      if(in%i==0)
      {
        sum=sum+i;
      }
    }
    if(sum==in)
    {
      System.out.println("perfect number");
    }
    else
    {
      System.out.println("not perfecr no");
    }

  }
}
