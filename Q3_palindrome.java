package java_practice_package_1;

public class Q3_palindrome {
		
	public static void main(String[] args) {
		int a=74547;
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