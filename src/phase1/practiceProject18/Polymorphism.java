package phase1.practiceProject18;

class Sum
{
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void sum(double a,double b)
	{
		System.out.println(a+b);
	}
}
public class Polymorphism 
{

	public static void main(String[] args) 
	{
		Sum s = new Sum();
		s.sum(10, 5);
		s.sum(10,4,6);
		s.sum(2.5, 5.5);
	}

}
