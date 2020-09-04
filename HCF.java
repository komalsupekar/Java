
import java.util.*;
import java.io.*;
class HCF
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    int in2=s.nextInt();
    int a=(in>in2)?in:in2;
    int sum=0,i;
    for(i=2;i<a;i++)
    {
      if(in%i==0 && in2%i==0)
      {
          sum=i;
      }
    }
    System.out.println(sum);
  }
}
