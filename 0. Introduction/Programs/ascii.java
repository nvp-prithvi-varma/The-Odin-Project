import java.util.Scanner;

public class ascii 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character: ");
		c = scan.next().charAt(0);
		int a;
		a = (int)c;
		System.out.println("ASCII value of the character is: "+a);
		scan.close();
	}

}
