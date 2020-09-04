// frndly pair in which sum of factor of 1 num is same to another  number vise versa

import java.util.*;
import java.io.*;
class Friendlypair
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    int in2=s.nextInt();
    int sum=0,sum2=0,i;
    for(i=1;i<=in/2;i++)
    {
      if(in%i==0)
      {
        sum=sum+i;
      }
    }
    for(i=1;i<=in2/2;i++)
    {
      if(in2%i==0)
      {
        sum2=sum2+i;
      }
    }

    if(sum==in2 && sum2==in)
    {
      System.out.println("perfect friends");
    }
    else
    {
      System.out.println("not perfecr frndsno");
    }

  }
}
