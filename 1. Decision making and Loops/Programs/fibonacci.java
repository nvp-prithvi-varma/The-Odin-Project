import java.util.Scanner;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,i,sum=0,j,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to generate fibonacci series: ");
		a = scan.nextInt();
		if(a==0)
		{
			System.out.println("Fibonacci Series till '0' is:");
			System.out.println("0");
		}
		else if(a==1)
		{	
			System.out.println("Fibonacci Series till '0' is:");
			System.out.println("0	1");
		}
		else
		{
			System.out.println("Fibonacci series till '"+a+"' is:");
			j=0;
			k=1;
			System.out.print(j+"\t"+k+"\t");
			for(i=0;i<a;i++)
			{
				sum = j+k;
				j=k;
				k=sum;
				System.out.print(sum+"\t");
			}
		}
		scan.close();
	}

}
