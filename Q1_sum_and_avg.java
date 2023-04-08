package java_practice_package_1;

public class Q1_sum_and_avg {

	public static void main(String[] args) {
		int a=78456;
		int sum=0;
		int b;
		int i;
		for(i=0;i<5;i++)
		{	
		b=a%10;
		sum=sum+b;
		a=a/10;
		}
		int avg=sum/5;
		
	System.out.println(sum);
	System.out.println(avg);
	}
		
		
}
