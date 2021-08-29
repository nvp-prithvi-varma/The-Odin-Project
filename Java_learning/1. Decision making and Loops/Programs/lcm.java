import java.util.Scanner;

public class lcm 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,i,x,y,lcm,gcd = 1;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=scan.nextInt();
		b=scan.nextInt();
		x=a;
		y=b;
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
					gcd = b;
					System.out.println("G.C.D. of "+x+" and "+y+" is: "+gcd);
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
					gcd = a;
					System.out.println("G.C.D. of "+x+" and "+y+" is: "+gcd);
				}
			}
		}
		lcm = (x/gcd)*y;
		System.out.println("L.C.M. of "+x+" and "+y+" is "+lcm);
		scan.close();
	}

}
