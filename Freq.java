import java.util.*;
import java.io.*;
//import Math;

class Freq
{
    public static void main(String args[])throws Exception
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      int freq[]=new int[n];
      int i,k=0;
      for(i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
        freq[i]=-1;
      }
      int count=0;
      for(i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]==arr[j])
          {
            count++;
            freq[j]=0;
          }
        }
      if(freq[i]!=0)
        freq[k]=count;
        k++;
      }
      for(i=0;i<n;i++)
      {
          if(freq[i]!=0)
          {
            System.out.println(freq[i]);
           }
      }
    }
  }
