import java.util.Scanner;

public class naturalNumbersSum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,i,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		a = scan.nextInt();
		if(a==1)
		{
			System.out.println("Sum of "+a+" natural numbers is "+a);
		}
		else
		{
			for(i=1;i<=a;i++)
			{
				sum = sum+i;
			}
			System.out.println("Sum of "+a+" natural numbers is "+sum);
		}
		scan.close();
	}

}
