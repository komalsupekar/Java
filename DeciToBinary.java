

import java.util.*;
import java.io.*;
class DeciToBinary
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    /*String st=s.next();         //this is binart to decimal
    int n=Integer.parseInt(st,2);*/
    int n=s.nextInt();
    String st=Integer.toBinary(n,2);
    System.out.println(n);
  }
}
