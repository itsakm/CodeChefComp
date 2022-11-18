import java.util.*;
class ChefDiv3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			long k=sc.nextLong();
			long d=sc.nextLong();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			long sum=0;
			for(int i=0;i<n;i++)
				sum=sum+a[i];
			if(sum>(k*d))
			{
				System.out.println(d);
			}
			else{
				System.out.println(sum/k);
			}
		}
	}
}