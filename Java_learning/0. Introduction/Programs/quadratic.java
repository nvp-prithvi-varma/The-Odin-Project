import java.util.Scanner;

public class quadratic 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c,d;
		double root1,root2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		//finding the determinant of quadratic equation
		d = (b*b) - (4*a*c);
		if(d>0)
		{
			root1 = (-b + Math.sqrt(d))/(2*a);
			root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("The roots of quadratic equation are"+root1+" and "+root2);
		}
		else if(d==0)
		{
			root1 = (-b)/(2*a);
			System.out.println("The roots of quadratic equation are"+root1+" and "+root1);
		}
		else
		{
			double real = -b / (2 * a);
		      double imaginary = Math.sqrt(-d) / (2 * a);
		      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
		scan.close();
	}

}
