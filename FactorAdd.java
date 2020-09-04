// Here we have to add the fraction numbers by tacking there HCf
//a/b c/d
import java.util.*;
import java.io.*;
class FactorAdd
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int d=s.nextInt();
    int i=0,num1=0,num2=0,ans=0,min=0;

    if(b==d)
    {
      num1=a+c;
      num2=b;
    }
    else
    {
      num1=(a*d)+(b*c);
      num2=b*d;
    }
    int a1=(num1<num2)?num1:num2;
    for(i=1;i<=num1;i++)
    {
      if((num1%i==0) && (num2%i==0))
      {
        min=i;
      }
    }
    num1=num1/min;
    num2=num2/min;
    System.out.println("Numerater: " +num1);
    System.out.println("Denominater: "+num2);
  }
}
