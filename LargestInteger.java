import java.util.*;
class LargestInteger
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=10;i>0;i--)
		{
			if(t%i==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}