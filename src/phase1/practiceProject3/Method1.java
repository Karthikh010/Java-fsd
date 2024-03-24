package phase1.practice_Project3;

public class Method1 
{
	//implementing a method
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public static void main(String[] args)
	{
		Method1 m = new Method1();
		System.out.println("Addition method gives: "+m.add(10,20));
	}
}
