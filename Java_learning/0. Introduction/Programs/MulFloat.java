import java.util.Scanner;

public class MulFloat 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two floating point numbers: ");
		a=scan.nextDouble();
		b=scan.nextDouble();
		System.out.println("Product of two floating point numbers is: "+(a*b));
		scan.close();
	}

}
