class StarPattern12Way1
{
	public static void main(String []Namita)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=1;k++)
			{
				System.out.print("*");
			}
		
			for(int j=2;j<(i*2)-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=2;k<=i;k++)
			{
				if(k==2)
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}  