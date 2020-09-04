import java.util.*;
import java.io.*;
class Combination
{
  public static int Fact(int n)
  {
    int fact=1;
    if(n==0 ||n==1)
    {
      return 1;
    }
    else
    {
      for(int i=2;i<=n;i++)
      {
        fact=fact*i;
      }
      return fact;
    }
  }
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int r=s.nextInt();
    if(n>r)
    {
      int ans=Fact(n)/(Fact(r)*Fact(n-r));
      System.out.println(ans);
    }
      else
      {
        System.out.println("not valid");
      }
  }
}
