import java.util.*;
import java.io.*;
//import Math;

class DigitOccu
{
  public static int occ(int n,int d)
  {
    int rem=0,count=0;
    while(n!=0)
    {
      rem=n%10;
      if(rem==d)
      {
        count++;
      }
      n=n/10;
    }
    return count;
  }
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int ans=occ(a,b);
    System.out.println(ans);
  }
}
