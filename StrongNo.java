// strong no in which no equlas to factorial sum of each digit

import java.util.*;
import java.io.*;
class PerfectNo
{
  public static int fact(int rem)
  {
    int sum=1;
    for(int i=1;i<rem;i++)
    {
      sum=sum*i+sum;
    }
      return sum;
  }
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    String st=Integer.toString(in);
    int len=st.length();
    int rem=0,n=in;
    double ans=0;
    while(n!=0)
    {
      rem=n%10;
      ans=ans+fact(rem);
      n=n/10;
      //System.out.println(ans);
    }
    if(in==ans)
    {
      System.out.println("Its strong no");
    }
    else
    {
      System.out.println("Its not strong no");
    }
  }
}
