import java.util.*;
class SpaceArrays
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			Arrays.sort(a);
			int sum=0;
			int flag=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]>(i+1))
				{
					flag=1;
				}
				else
				{
					sum=sum+((i+1)-a[i]);

				}
			}
			if(flag==1)
			{
				System.out.println("Second");
			}
			else if(flag!=1 && sum%2==0)
			{
				System.out.println("Second");
			}
			else if(flag!=1 && sum%2!=0)
			{
				System.out.println("First");
			}
		}
	}
}