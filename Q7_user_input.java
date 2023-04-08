package java_practice_package_1;

import java.util.Scanner;

public class Q7_user_input {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1;
		int i;
		for(i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);
}

	}


