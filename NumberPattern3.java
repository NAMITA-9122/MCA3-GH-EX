class NumberPattern3
{
	public static void main(String []args)
	{
		int temp=0;
		for( int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				temp=temp+1;
				System.out.print(" "+temp);
			}
			System.out.println();
		}
	}
}