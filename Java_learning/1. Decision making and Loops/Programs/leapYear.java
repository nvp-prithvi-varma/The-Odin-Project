import java.util.Scanner;

public class leapYear 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an year: ");
		a = scan.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
			else
			{
				flag = true;
			}
		}
		else
		{
			flag = false;
		}
		if(flag == true)
		{
			System.out.println(a+" is a leap year");				
		}
		else
		{
			System.out.println(a+" is not a leap year");
		}
		scan.close();
	}
}
