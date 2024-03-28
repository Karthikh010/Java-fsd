package phase1.practiceProject16;

class IllegalAgeException extends Exception
{
	public IllegalAgeException(String s)
	{
		super(s);
	}
}

public class Example1 
{

	public static void main(String[] args) 
	{
		int age=-5;
		try
		{
			if(age<0)
			{
				throw new IllegalAgeException("Age cannot be less than zero");
			}
		}
		catch(IllegalAgeException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Try again with valid age.");
		}
	}

}
