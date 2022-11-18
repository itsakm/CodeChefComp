import java.util.*;
class Meet
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t--!=0)
		{
			String t1=sc.nextLine();
			int h1=0;
			int m1=0;
			if(t1.charAt(6)=='a')
			{

			}
			System.out.println(t1);
			int n=sc.nextInt();
			System.out.println(n);
			String time[]=new String[n+1];
			for(int i=0;i<=n;i++)
				time[i]=sc.nextLine();
			for(int i=0;i<=n;i++)
				System.out.println(time[i]);
			
			
		}
	}
}