package phase1.practiceProject14;

import java.util.Scanner;

public class MyClass 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divident");
		int a = sc.nextInt();
		System.out.println("Enter the divisor");
		int b = sc.nextInt();
		try
		{
			System.out.println("Answer: "+a/b);
		}
		catch(ArithmeticException e)
		{
			 System.out.println("Cannot divide by zero!");
		}
		finally
		{
			System.out.println("Try again with another divisor");
		}
		sc.close();
	}

}
