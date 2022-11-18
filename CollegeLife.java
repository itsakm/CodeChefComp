import java.util.*;
class CollegeLife
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int n=sc.nextInt();
			int e=sc.nextInt();
			int h=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			System.out.println(Math.min(Math.min(a,b),c));
		}
	}
}