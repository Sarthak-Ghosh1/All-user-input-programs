package java_practice_package_1;

import java.util.Scanner;

public class Q6_user_input {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int i;
	int m;
	int j;
	
	for(i=1;i<n;i++)
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
