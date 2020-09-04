// factorial of number

import java.util.*;
import java.io.*;
class Fact
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    int sum=0;
    for(int i=1;i<in;i++)
    {
      if(in%i==0)
      {
        sum=sum+i;
      }
    }
      System.out.println(sum);
  }
}
