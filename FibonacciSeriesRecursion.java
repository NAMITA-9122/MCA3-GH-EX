class FibonacciSeriesRecursion
{
	static int a=0,b=1 ,c=0;
	public static void main(String []args)
	{
		System.out.print(a+" "+b+" ");
		FibonacciSeriesRecursion fsr=new FibonacciSeriesRecursion();
		fsr.Fibonacci(0);
		
		
	}
			void Fibonacci(int fib)
			{
				 
				if(fib<=10)
				{
					
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
				Fibonacci(fib+1);
				}
				
			}	
		
	
}