import java.util.Scanner;

class PalinedromeNumberWithScanner
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=s.nextInt();
		
		int rev=0,rem=0;
		int pal=num;
		
		for(int i=0;num>0;i++)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(rev==pal)
		{
			System.out.println(pal+" is Palinedrome Number");
		}
		else
		{
			System.out.println(pal+" is not Palinedrome Number");
		}
		
	}
}