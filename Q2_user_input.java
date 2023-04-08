package java_practice_package_1;

import java.util.Scanner;

public class Q2_user_input {

	public static void main(String[] args) {

	
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				int f=1;
				int l=n%10;
				int n1=n;
				while(n!=0)
				{	
					f=f*10;
					n=n/10;
				}
				f=f/10;
				int ft=n1/f;
				System.out.println(l+ft);
					
		}

	}


