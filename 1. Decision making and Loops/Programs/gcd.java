import java.util.Scanner;

public class gcd 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,i;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		int x=a;
		int y=b;
		while(flag)
		{
			if(a>b)
			{
				i=b;
				b=a%b;
				a=i;
				if(a%b==0)
				{
					flag = false;
					System.out.println("G.C.D. of "+x+" and "+y+" is: "+b);
				}
			}
			else
			{
				i=a;
				a=b%a;
				b=i;
				if(b%a==0)
				{
					flag = false;
					System.out.println("G.C.D. of "+x+" and "+y+" is: "+a);
				}
			}
		}
		scan.close();
	}

}
