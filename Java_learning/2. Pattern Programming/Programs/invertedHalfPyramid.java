import java.util.Scanner;

public class invertedHalfPyramid 
{
	public static void main(String[] args)
	{
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the inverted half pyramid: ");
		a = scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}
}
