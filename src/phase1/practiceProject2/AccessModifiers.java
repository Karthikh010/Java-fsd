package phase1.practiceProject2;

class DefAccess
{
	void display()
	{
		System.out.println("Default Access Specifier");
	}
	
	private void show()
	{
		System.out.println("Private Access Specifier");
	}
	
	protected void dsply()
	{
		System.out.println("Protected Access Specifier");
	}
	
	public void showP()
	{
		System.out.println("Public Access Specifier");
	}
}

public class AccessModifiers {

	public static void main(String[] args) 
	{
		DefAccess da = new DefAccess();
		da.display();
		//da.show();
		da.dsply(); 
		da.showP();
	}

}
