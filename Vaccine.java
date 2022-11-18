import java.util.*;
class Vaccine
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1,v1,d2,v2,p;
		d1=sc.nextInt();
		v1=sc.nextInt();
		d2=sc.nextInt();
		v2=sc.nextInt();
		p=sc.nextInt();
		int day=0;
		int v=0;
		while(v<p)
		{
			day++;
			if(day==d1)
			{
				v=v+v1;
				d1++;
			}
			if(day==d2){

				v=v+v2;
				d2++;
			}
			System.out.println("DAy="+day+"v="+v);
		}
		System.out.println(day);

	}
}