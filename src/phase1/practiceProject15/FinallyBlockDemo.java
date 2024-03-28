package phase1.practiceProject15;

public class FinallyBlockDemo {

	public static void main(String[] args) 
	{
		int[] arr = new int[4];
		try
		{
			arr[6]=10;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			arr[0]=10;
			System.out.println("The array element is : "+arr[0]);
		}
	}

}
