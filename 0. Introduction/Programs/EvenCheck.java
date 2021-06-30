import java.util.Scanner;

public class EvenCheck 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Enter a number: ");
		a = scan.nextInt();
		if(a%2==0)
			System.out.println(a+" is an even number");
		else
			System.out.println(a+" is an odd number");
		scan.close();
	}

}
