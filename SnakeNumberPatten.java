class SnakeNumberPatten
{
	public static void main(String []Namita)
	{
			int k=0;
		for (int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=3;j++)
				{
					k=k+1;
					System.out.print(" "+k);
					
				
				}
			}
			else
			{
				int temp=k+1;
				for(int j=k+3;j>=temp;j--)
				{
					k=k+1;
					System.out.print(" "+j);
					
				}
			}
			System.out.println();
		}
	}
}  