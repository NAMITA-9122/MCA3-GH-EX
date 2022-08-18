import java.util.Scanner;

class ReverseNum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a digit ");
		int a=s.nextInt();
		
		int rev=0,rem=0;
		
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		
		System.out.println("Reverse Number = "+ rev);
	}
	
}