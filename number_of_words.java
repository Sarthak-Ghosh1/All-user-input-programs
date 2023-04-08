package java_practice_package_1;

public class number_of_words {

	public static void main(String[] args) {
		int i;
		int m=0;
		String n="Indi's capital is new delhi";
		for(i=0;i<n.length();i++)
		{
			if(n.charAt(i)==' ')
			{
				m++;
			}
		}
		System.out.println(m+1);
	}

}
