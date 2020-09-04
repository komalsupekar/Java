import java.util.*;
import java.io.*;
//import Math;

class ExactDivisors
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int d=s.nextInt();
    int count1=0,count2=0;
    for(int i=1;i<=n;i++)
    {
      count1=0;
      for(int j=1;j<=n;j++)
      {
        if(i%j==0)
        {
          count1++;
          //System.out.println(i);
        }
      }
    if(count1==d)
    {
      System.out.println(" The numbers are: "+i);
      count2++;
    }
    else
    continue;
    //  System.out.println("false");
    }
    System.out.println(count2);

  }
}
