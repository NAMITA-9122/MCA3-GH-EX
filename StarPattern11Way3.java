class StarPattern11Way3
{
	public static void main(String []Namita)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(i==j)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}
	}
}  