import java.util.*;
import java.io.*;
class LCM
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    TreeSet<Integer>tr1=new TreeSet<>();
    TreeSet<Integer>tr2=new TreeSet<>();
    int in=s.nextInt();
    int in2=s.nextInt();
    int i;
    int a=(in>in2)?in:in2;
    for(i=a;i<in*in2;i=i+a)
    {
      if(i%in==0 && i%in2==0)
      {
        break;
      }
    }
    System.out.println("LCM of num is "+i);
  }
}
