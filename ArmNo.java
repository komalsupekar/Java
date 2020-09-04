//armstrong no

import java.util.*;
import java.io.*;
// import java.maths.*;
class ArmNo
{
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
      ans=ans+Math.pow(rem,len);
      n=n/10;
    }
    if(in==ans)
    {
      System.out.println("Its armstrong no");
    }
    else
    {
      System.out.println("Its not armstrong no");
    }
  }
}
