

import java.util.*;
import java.io.*;
class BinarytoDec
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    String st=s.next();
    int n=Integer.parseInt(st,8);
    //int n=s.nextInt();        this is decimal to binart
    // String st=Integer.toString(n,2);
    System.out.println(n);
  }
}
