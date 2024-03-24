package phase1.practice_Project3;

public class Method2 
{
	int val=120;
	int addto(int val)
	{
		val+=30;
		return val;
	}
	public static void main(String[] args) 
	{
		Method2 m = new Method2();
		System.out.println("Before calling the method: "+m.val);
		m.addto(100);
		System.out.println("After calling the method: "+m.val);
	}

}
