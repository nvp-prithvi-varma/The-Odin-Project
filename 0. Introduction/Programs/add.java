import java.util.Scanner;

public class add 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Sum of two numbers is: "+(a+b));
		scan.close();
	}

}
