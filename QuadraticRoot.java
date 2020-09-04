import java.util.*;
import java.io.*;
//import Math;

class QuadraticRoot
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int val=b*b-4*a*c;
    double root =Math.sqrt(val);
    if(root==0)
    {
      //ans=-b/2*a;
      System.out.println(-b/2*a);
    }
    if(root<0)
    {
      //ans=-b/2*a ;
      System.out.println(-b/2*a+"+i"+root);
      System.out.println(-b/2*a+"-i"+root);
    }
    else
    {
      //ans=(-b+root)/2*a;
      System.out.println((-b+root)/2*a);
      System.out.println((-b-root)/2*a);
    }
  }
}
