import java.util.Scanner;

class RecursionFunctionFactorial
{
	int res=1;
	
	int recFact(int fact)
	{
		if(fact>1)
		{
			res=res*fact;
			recFact(fact-1);
			
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int ans=0;
		
		System.out.println("Enter Factorial Number");
		int num = s.nextInt();
		
		RecursionFunctionFactorial rf=new RecursionFunctionFactorial();
		ans=rf.recFact(num);
		
		System.out.println(ans);
	}
}