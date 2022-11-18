import java.util.*;
class funnyname
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t--!=0)
		{
			int n=sc.nextInt();
			String s[]=new String[n];
			for(int i=0;i<n;i++)
			{
				s[i]=sc.next();
			}
			HashSet<String> h= new HashSet<String>();
			for(int i=0;i<n;i++)
			{
				h.add(s[i]);
				
			}
			int count=0;
			for(int i=0;i<n;i++)
			{
				
				for(int j=i+1;j<n;j++)
				{
					
					String s1=s[j].charAt(0)+s[i].substring(1,s[i].length());
					String s2=s[i].charAt(0)+s[j].substring(1,s[j].length());
					System.out.println(s1+" "+s2);
					if(!h.contains(s1) && !h.contains(s2))
						count=count+2;
				}
				System.out.println();
			}
			System.out.println(count);
		}
	}
}