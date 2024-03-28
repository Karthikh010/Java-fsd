package phase1.practiceProject15;

public class ThrowDemo 
{

	public static void main(String[] args) 
	{
		int a=10,b=0;
		try
		{
			if(b==0)
			{
				throw(new ArithmeticException("Divide by Zero is invalid"));
			}
			else
			{
				System.out.println("Quotient is:"+a/b);
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
