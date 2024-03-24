package phase1.practiceProject7;

abstract class AbClass
{
	public abstract void display();
}

public class InnerClassEg 
{
	private String s = "Hi,";
	private String msg = "This is inner class.";
	
	class InnerClass
	{
		void dspl()
		{
			System.out.println(s+" How are you!");
		}
	}
	
	void show()
	{
		class InnerC
		{
			void msg()
			{
				System.out.println(msg);
			}
		}
		InnerC i = new InnerC();
		i.msg();
	}
	
	public static void main(String[] args) 
	{
		InnerClassEg ic = new InnerClassEg();
		InnerClassEg.InnerClass cl = ic.new InnerClass();
		cl.dspl();
		ic.show();
		
		AbClass abc = new AbClass() 
		{
			public void display()
			{
				System.out.println("Anonymous inner class.");
			}
		};
		abc.display();
	}

}
