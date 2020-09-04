// automorphic no in which noumber is same to the ending digits of sqaure of that noumber

import java.util.*;
import java.io.*;
class AutomorphicNo
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    String st=Integer.toString(in);
    int len1=st.length();
    long power=(long)Math.pow(in,2);
    String str=Long.toString(power);
    int len2=str.length();
    String s3=str.substring(len2-len1);
    if(st.equals(s3))
    {
      System.out.println("Automorphic number");
    }
    else
    {
      System.out.println("Not automorphic number");
    }
  }
}
