/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class An
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int m=s.nextInt();
	    int n=s.nextInt();
	    int a[][]=new int[m+1][n+1];
	    int b[][]=new int[m+1][n+1];
	    int i,j;
	    int sum=0;
	    for(i=0;i<m;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            b[i][j]=s.nextInt();
	        }
	    }
	     for(i=0;i<m;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            sum=sum+b[i][j];

              }
	    }
	    System.out.println(sum);
	    a[m-1][n-1]=sum;
	     for(i=0;i<m;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            if(i==j && i==0){
	                a[i][j]=b[i][j];
	            }
	            else if(i>0 && j==0)
	            {
	                a[i][j]=b[i-1][j]+b[i][j];
	            }
	            else if(i==0 && j>0)
	            {
	                a[i][j]=b[i][j-1]+b[i][j];
	                //System.out.println("a"+a[i][j]);
	            }
	        }
	    }
	      for(i=0;i<m;i++)
	    {
	        for(j=0;j<n;j++)
	        {
	            System.out.print(a[i][j]);

              }
	    }

	//	System.out.println("Hello World");
	}
}
