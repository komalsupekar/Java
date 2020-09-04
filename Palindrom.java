//check pallindrom or not
//reverse no

import java.io.*;
import java.util.*;
public class Palindrom
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    String str=s.next();
    StringBuffer br=new StringBuffer(str);
    br.reverse();
    if(str.equals(br))
    {
      System.out.println("Palindrom");
    }
    else
    {
      System.out.println("not pallindrom");
    }
  }
}
