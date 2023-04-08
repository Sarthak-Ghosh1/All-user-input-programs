package java_practice_package_1;

import java.util.Scanner;

public class Q1_user_input {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		float sum=0;
		float b;
		while(n!=0)
		{	
		b=n%10;
		sum=sum+b;
		n=n/10;
		count++;
		}
		float avg=sum/count;
		
	System.out.println(sum);
	System.out.println(avg);

	}

}
