import java.util.*;
import java.io.*;
class ReplaceZnO
{
  public static void main(String args[])throws Exception
  {
    Scanner s=new Scanner(System.in);
    int in=s.nextInt();
    String st=Integer.toString(in);
    String str="";
    for(int i=0;i<st.length();i++)
    {
      char c=st.charAt(i);
      if(c=='0')
      {
        str=str+1;;
      }
      else
      {
        str=str+c;
      }
    }
    System.out.println(str);
  }
}
