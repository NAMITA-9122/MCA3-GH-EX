import java.util.Scanner;
class ReverseString
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a name ");
		String name=s.next();
		
		int leng=name.length();
		String rev="";
		
		for(int i=leng-1; i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev +" is the Reverse name of "+name);
	}
}