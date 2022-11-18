import java.util.*;
class Paparaji
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int h[]=new int[n+1];
			for(int i=1;i<=n;i++)
				h[i]=sc.nextInt();
			int dis=-1;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.println("i="+i);
					System.out.println("j="+j);
					int flag=0;
					for(int k=i+1;k<j;k++)
					{
						System.out.println("inside k");
						System.out.println("h[k]="+h[k]);
						System.out.println("h[i]="+h[i]);
						System.out.println("h[j]="+h[j]);
						if(h[k]>h[j])
							flag=1;
					}
					System.out.println("flag="+flag);
					if(flag==0)
					{
						dis=Math.max(dis,(j-i));
					}
					System.out.println("dis="+dis);
				}
			}
			System.out.println(dis);

		}
	}
}