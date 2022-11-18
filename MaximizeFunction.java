import java.util.*;
import java.lang.*;
class MaximizeFunction
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			long n=sc.nextLong();
			long a[]=new long[(int)n];
			for(long i=0;i<n;i++)
			{
				a[(int)i]=sc.nextLong();
			}
			Arrays.sort(a);
			long x=a[(int)0];
			long y=a[(int)1];
			long z=a[(int)(n-1)];
			System.out.println(Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x));
		}
	}
}