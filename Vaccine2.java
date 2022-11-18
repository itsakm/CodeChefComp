import java.util.*;
class Vaccine2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t=sc.nextLong();
		while(t--!=0)
		{
			long n=sc.nextLong();
			long d=sc.nextLong();
			long a[]=new long[(int)n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextLong();
			long risky=0;
			long nonrisky=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]<=9 || a[i]>=80)
					risky++;
				else
					nonrisky++;
			}
			int day=0;
			for(long j=0;j<n;j++)
			{
				if(risky>=1)
				{
					risky=risky-d;
					day++;
				}
				else if(nonrisky>=1)
				{
					nonrisky=nonrisky-d;
					day++;
				}
				if(risky<=0 && nonrisky<=0)
				{
					break;
				}
			}

			System.out.println(day);

		}
	}
}