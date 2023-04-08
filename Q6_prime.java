package java_practice_package_1;

public class Q6_prime {
	public static void main(String[] args) {
		
		int i;
		int m;
		int j;
		
		for(i=1;i<300;i++)
		{
			m=0;
			for(j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				m++;
			}
			}
		if(m==2)
		{
			System.out.println(i);
		}
			
			
		}
		
}
}
