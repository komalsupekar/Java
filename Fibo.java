import java.util.*;
import java.io.*;
// import java.maths.*;
class Fibo
{
  public static void main(String[] args) throws Exception
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a=1,b=1,c=0;
    for(int i=0;i<=n;i++)
    {
      c=a+b;
      a=b;
      b=c;
      System.out.println(c);
    }
    //System.out.println(c);
  }
}
