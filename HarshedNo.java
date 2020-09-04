// if the number perfectly divides by the sum of sinlgle digits then its harshed number

import java.util.*;
import java.io.*;
class HarshedNo
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    int rem=0,sum=0;
    for(int i=0;i<=in;i++)
    {
      rem=in%10;
      in=in/10;
      sum=sum+rem;
      System.out.println(sum);
    }
    if(in%sum==0)
    {
      System.out.println("harshed number");
    }
    else
    {
      System.out.println("not harshed no");
    }

  }
}
