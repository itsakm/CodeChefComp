import java.util.*;
class PointOfImpact
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			long n=sc.nextLong();
			long k=sc.nextLong();
			k=k%4;
			long x=sc.nextLong();
			long y=sc.nextLong();
			long max=0;
			if(x>y)
			{
				if(k==1)
				{
					System.out.println(n+" "+(y+n-x));
					
				}
				else if(k==2)
				{
					System.out.println((y+n-x)+" "+n);
					
				}
				else if(k==3)
				{
					System.out.println(0+" "+(x-y));
					
				}
				else
				{
					System.out.println((x-y)+" "+0);
					
				}
			}
			else if(x<y)
			{
				if(k==1)
				{
					System.out.println((x+n-y)+" "+n);
					
				}
				else if(k==2)
				{
					System.out.println(n+" "+(n+x-y));
					
				}
				else if(k==3)
				{
					System.out.println((y-x)+" "+0);
					
				}
				else
				{
					System.out.println(0+" "+(y-x));
					
				}
			}
			else if(x==y)
			{
				System.out.println(n+" "+n);
			}
		}
	}
}