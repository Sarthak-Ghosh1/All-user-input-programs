package java_practice_package_1;

import java.util.Scanner;

public class Q4_user_input {

	public static void main(String[] args) {
		int i;
		Scanner s=new Scanner(System.in);
		String name=s.next();

		for(i=name.length()-1;i>=0;i--)
		
		System.out.print(name.charAt(i));

	}

}
