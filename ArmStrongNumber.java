class ArmStrongNumber
{
	public static void main(String []args)
	{
		int no=2,leng=0;
		int t1=no;
		while(t1!=0)
		{
			t1=t1/10;
			leng=leng+1;
		}
		
		int t2=no,arm=0,rem;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=leng;i++)
			{
				mul=mul*rem;
		 	}
			t2=t2/10;
			arm=arm+mul;
			
		}
			if(arm==no)
			{
				System.out.println(no+" is arm Strong Number");
			}
			else
			{
				System.out.println(no+" is not arm Strong Number");
			}
	}
}