import java.util.Scanner;

public class print 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a;
		a = scan.nextInt();
		System.out.println("Entered number is: "+a);
		scan.close();
	}

}
