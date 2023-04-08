package java_practice_package_1;

import java.util.Scanner;

public class Q5_user_input {

	public static void main(String[] args) {
		int i;
		int m=0;
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int r=n.length();
		for(i=0;i<r;i++)
		{
			if(n.charAt(i)==' ')
			{
				m++;
			}
		}
		System.out.println(m+1);

	}

	
}
