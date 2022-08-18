class PalinedromeNum
{
	public static void main(String []args)
	{
		int num=121,rev=0,rem=0;
		int pal=num;
		for(int i=0;num!=0;i++)
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
			System.out.println(pal+" is Not Palinedrome");
		}
	}
}