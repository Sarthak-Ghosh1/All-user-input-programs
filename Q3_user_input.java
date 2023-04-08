package java_practice_package_1;

import java.util.Scanner;

public class Q3_user_input {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int a=s.nextInt();
	int n=a;
	int b;
	int rev=0;
	 
	
	while(n!=0)
	{
		b=n%10;
		rev=(rev*10)+b;
		n=n/10;
	}
	
	System.out.println(rev);
	
	if(a==rev)
	{
	System.out.println("palindrome");
}
	else
	{
		System.out.println("not palindrome");
	}
}

}