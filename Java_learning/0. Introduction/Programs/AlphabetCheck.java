import java.util.Scanner;

public class AlphabetCheck 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char c;
		System.out.println("Enter a character: ");
		c = scan.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println(c+" is a vowel");
		else
			System.out.println(c+" is a constant");

	}

}
