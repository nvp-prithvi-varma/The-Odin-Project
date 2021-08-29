import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,i,product=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		a = scan.nextInt();
		for(i=1;i<=a;i++)
		{
			product = product * i;
		}
		System.out.println("factorial of "+a+" is "+product);
		scan.close();
	}

}
