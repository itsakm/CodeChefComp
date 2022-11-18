/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FlipCoin

{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0)
	    {
	        int g=sc.nextInt();
	        for(int j=0;j<g;j++)
	        {
	            int i=sc.nextInt();
	            int n=sc.nextInt();
	            int q=sc.nextInt();
	            if(n%2!=0 && q==1)
	            {
	                System.out.println(n/2+1);
	            }
	            if(n%2==0 && q==0)
	            {
	                System.out.println(n/2);
	            }
	        }
	    }
		// your code goes here
	}
	
}
