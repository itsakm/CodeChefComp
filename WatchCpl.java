import java.util.*;
class WatchCpl
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int h[]=new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				h[i]=sc.nextInt();
				sum=sum+h[i];	
			}
			if(sum<2*k)
			{
				System.out.println(-1);
				continue;
			}
			else if(sum==2*k)
			{
				System.out.println(h.length);
				continue;
			}
			else if(sum>2*k)
			{
				
			}
			for(int i=0;i<n;i++)
				System.out.print(h[i]+" ");
			Arrays.sort(h);
			for(int i=0;i<n;i++)
				System.out.print(h[i]+" ");
			int sum1=0;
			int sum2=0;
			int i=n-1;
			int count=0;
			while(i>=0)
			{
				if(sum1>=k && sum2>=k)
					break;
				if(sum1<k)
				{
					sum1=sum1+h[i];
					count++;
					--i;
				}
				if(sum2<k)
				{
					sum2=sum2+h[i];
					count++;
					--i;
				}
				System.out.println("sum1="+sum1);
				System.out.println("sum2="+sum2);
			}
			System.out.println("count="+count);


		}
	}
}