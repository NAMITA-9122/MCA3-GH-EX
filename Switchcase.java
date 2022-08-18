import java.util.Scanner;

class Switchcase
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First digit");
		int num1=s.nextInt();
		
		System.out.println("Enter Second digit");
		int num2=s.nextInt();
		
		System.out.println("Enter Symbol for operation [+,-,*,/,%]");
		String symbol=s.next();
		
		int res;
		
		switch(symbol)
		{
			case "+": res=num1+num2;
					  System.out.println("Addition = "+res);
					  break;
			
			case "-": res=num1-num2;
					  System.out.println("Subtract = "+res);
					  break;
					  
			case "*": res=num1*num2;
					  System.out.println("Multiply = "+res);
					  break;
					  
			case "/": res=num1/num2;
						System.out.println("Divide ="+res);
						break;
						
			case "%": res=num1%num2;
					  System.out.println("Remainder ="+res);
					  break;
					  
			default :
					System.out.println("You have entered wrong Symbol");
					

		}
		
	}
}
