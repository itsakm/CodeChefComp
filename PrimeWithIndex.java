import java.util.*;
import java.io.*;
class PrimeWithIndex
{
	public static boolean checkPrime(int n)
	{
		if(n<=1)
			return false;
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		int arr[] = new int[arrTemp.length];
        for (int i = 0; i < arrTemp.length; i++) {
           arr[i] = Integer.parseInt(arrTemp[i]);
        }
        int flag=1;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]<2 || arr[i]>99)
        	{
        		flag=0;
        		break;
        	}
        }
        if(flag==0)
        {
        	System.out.println("Invalid Input");
        }
        else if(flag==1)
        {
        	for(int i=0;i<arr.length;i++)
        	{
        		if(checkPrime(arr[i]) && checkPrime(i))
        		{
        			System.out.println(arr[i]+" - at index "+i);
        		}
        	}
        }
        bufferedReader.close();
		
	}
}