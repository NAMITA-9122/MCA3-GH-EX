import java.util.Scanner;

class FactorialNumber
{
	public static void main(String[] args)
	{
		int f=1;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Factorial Number");
		int num=s.nextInt();
		
		System.out.print(num+" = ");
		
		for(int i=num; i>=1 ;i--)
		{
			f=f*i;
			
			System.out.print(i);
			
			if (i>1)
			{
				System.out.print(" * ");
			}
		}
		System.out.print(" = "+f);
	}
}