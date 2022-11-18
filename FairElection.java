import java.util.*;
class FairElection
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			long a[]=new long[n];
			long b[]=new long[m];
			long sum_a=0;
			long sum_b=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
				sum_a=sum_a+a[i];
			}
			for(int i=0;i<m;i++)
			{
				b[i]=sc.nextInt();
				sum_b=sum_b+b[i];
			}
			if(sum_a>sum_b)
			{
				System.out.println(0);
				continue;
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int i=0;
			int j=m-1;
			int swap=0;
			while(i<n)
			{
				if(sum_a>sum_b || j<0)
				{
					break;
				}
				sum_a=sum_a-a[i];
				sum_b=sum_b-b[j];
				sum_a=sum_a+b[j];
				sum_b=sum_b+a[i];
				swap++;
				i++;
				j--;
				System.out.println(sum_a);
				System.out.println(sum_b);
			}
			if(sum_a>sum_b)
			{
				System.out.println(swap);
			}
			else
			{
				System.out.println(-1);
			}
		}


	}
}