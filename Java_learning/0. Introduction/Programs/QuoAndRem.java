import java.util.Scanner;

public class QuoAndRem 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("The quotient of "+a+" and "+b+" is: "+(a/b));
		System.out.println("The remainder of "+a+" and "+b+" is: "+(a%b));
		scan.close();
	}

}
