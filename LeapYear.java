class LeapYear
{
	public static void main(String[] args)
	{
		int year=2016;
		
		if (year%4==0)
		{
			if(year%100==0 )
			{
				if(year%400==0)
				{
					System.out.println("Leap Year "+year);
				}
				else
				{
					System.out.println("Not Leap Year "+year);
				}
			}
			else
			{
				System.out.println("Leap Year "+year);
			}
		}
		else
		{
			System.out.println("Not Leap year "+year);
		}
	}
}