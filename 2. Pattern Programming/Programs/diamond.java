import java.util.Scanner;

public class diamond 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the pyramid: ");
		a = scan.nextInt();
		scan.close();
		for(int i=0;i<a;i++)
		{
			for(int k=a-1;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("* ");			
			}
			System.out.println();
		}
		for(int i=1;i<a;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<a;j++)
			{
					System.out.print("* ");			
			}
			System.out.println();
		}
	}

}
