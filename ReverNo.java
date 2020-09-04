//reverse no using string or direct print no

import java.util.*;
import java.io.*;
// import java.maths.*;
class ReverNo
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rem=0;
    String ans="";
    while(n!=0)
    {
      rem=n%10;
      n=n/10;
      ans=ans+rem;
      //  System.out.print(rem);
    }
     System.out.println(ans);
  }
}
