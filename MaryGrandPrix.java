import java.util.*;
class MaryGrandPrix
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=4;
		int v[]={1,7,2,1};
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=i;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);	
		}
		while(true)
		{
			for(int i=0;i<n;i++){
				a[i]=a[i]+v[i];
				System.out.println(i+" "+a[i]);
			}
		}
	}
}