import java.util.Scanner;

public class swap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("--------Before Swapping--------");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("--------After Swapping--------");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		scan.close();
	}

}
