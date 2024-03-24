package phase1.practice_Project3;

public class MethodOverloading 
{
	public void display()
	{
		System.out.println("The number is 0");
	}
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println("The number is "+c);
	}
	public void display(int a,int b, int c)
	{
		int d=a+b+c;
		System.out.println("The number is "+d);
	}
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.display();
		m.display(10,20);
		m.display(10,20,30);
	}

}
