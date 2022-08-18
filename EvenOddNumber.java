class EvenOddNumber
{
	public static void main(String[] args)
	{
		int number=5;
		
		if (number==0)
		{
			System.out.println("Wrong Number");
			System.out.println("Test");
		}
		else if(number%2==0)
		{
			System.out.println("Even Number "+number);
		}
	
		else
		{
			System.out.println("Odd Number "+number);
		}
	}
}