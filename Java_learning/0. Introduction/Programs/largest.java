import java.util.Scanner;

public class largest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is largest among three numbers");
		}
		else if(b>c)
		{
			System.out.println(b+" is largest among three numbers");
		}
		else
		{
			System.out.println(c+" is largest among three numbers");
		}
		scan.close();
	}

}
