package phase1.practiceProject15;

public class ThrowsDemo 
{
	static void Div() throws ArithmeticException
	{
		int a=10,b=0;
		System.out.println(a/b);
	}

	public static void main(String[] args) 
	{
			try
			{
				Div();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot divide by zero");
			}
	}

}
