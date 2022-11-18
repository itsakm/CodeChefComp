import java.util.*;
class EncodedString
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		char a[]=new char[17];
		for(int i=97,j=0;i<=113;i++,j++)
			a[j]=(char)i;
		
		while(t--!=0)
		{
			long n=sc.nextLong();
			String s=sc.next();
			int i=0;
			while(i<s.length())
			{
				String temp=s.substring(i,i+4);
				int decimal=Integer.parseInt(temp,2);
				System.out.print(a[decimal]);
				i=i+4;
			}
			
			
		}
	}
}