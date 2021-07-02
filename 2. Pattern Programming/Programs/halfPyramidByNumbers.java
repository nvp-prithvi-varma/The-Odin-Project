import java.util.Scanner;

public class halfPyramidByNumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the pyramid: ");
		a = scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(j<=i)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
