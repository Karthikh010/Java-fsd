package phase1.practiceProject15;

class InvalidNameException extends Exception
{
	public InvalidNameException(String s)
	{
		super(s);
	}
}

public class Main 
{

	public static void main(String[] args) 
	{
		String name=" ";
		try
		{
			if(name.equals(" "))
				throw new InvalidNameException("Name cannot be null");
		}
		catch(InvalidNameException e)
		{
			e.printStackTrace();
		}
	}

}
