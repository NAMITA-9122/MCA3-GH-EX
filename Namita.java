 abstract class Ankit
{
	void add()
	{
		System.out.println("Ankt method");
	}
}

class Namita extends Ankit
{
	void sub()
	{
		System.out.println("Namita method");
	}
	
	public static void main(String[] args)
	{
		Ankit an=new Namita();
		an.add();
	}
}