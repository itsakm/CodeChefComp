import java.util.*;
class evenpairsum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int pair=0;
			for(int i=1;i<=a;i++)
			{
				for(int j=1;j<=b;j++)
				{
					if((i+j)%2==0)
						pair++;
				}
			}
			System.out.println(pair);
		}
	}
}