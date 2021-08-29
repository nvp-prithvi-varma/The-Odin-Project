import java.util.Scanner;

public class invertedHalfPyramidByNumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the inverted half pyramid: ");
		a = scan.nextInt();
		for(int i=1;i<=a;i++)
		{
			int k = 1;
			for(int j=a;j>=i;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		scan.close();
	}

}
