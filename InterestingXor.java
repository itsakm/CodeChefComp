import java.util.*;
class InterestingXor
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long t=sc.nextLong();
		while(t--!=0)
		{
			long c=sc.nextLong();
			String s=Long.toBinaryString(c);
			System.out.println(s);
			String a="1";
			String b="0";
			for(int i=1;i<s.length();i++)
			{
				if(s.charAt(i)=='1')
				{
					a=a+"0";
					b=b+"1";
				}
				if(s.charAt(i)=='0')
				{
					a=a+'1';
					b=b+'1';
				}
				System.out.println("a="+a);
				System.out.println("b="+b);
			}
			long x=Long.parseLong(a,2);
			long y=Long.parseLong(b,2);
			System.out.println(x*y);

			/*long temp=1;
			long d=1;
			while(true)
			{
				temp=1<<d;
				if(temp>c)
				{
					break;
				}
				d++;
			}
			long max=0;
			for(long i=temp;i>=0;i--)
			{
				for(long j=temp;j>=0;j--)
				{
					if((i^j)==c){
						long mul=i*j;
						if(mul>=max)
							max=mul;
					}
				}
			}
			System.out.println(max);*/
		}

	}
}