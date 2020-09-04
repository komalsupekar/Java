//Check nomis prime or nor
//find out prime nos from given range

import java.util.*;
import java.io.*;
class PrimeNo
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    //int n=s.nextInt();
    int start=s.nextInt();
    int end=s.nextInt();
    int count=0;
    for(int i=start;i<=end;i++)
    {
      for(int j=1;j<=n;j++)
      {
        if(i%j==0)
        {
          count++;
        }
      }
      if(count==2)
      {
        System.out.println(i+"PrimeNo");
        count=0;
      }
    }
  }
}
