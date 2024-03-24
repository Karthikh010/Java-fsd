package phase1.practiceProject4;

class Employee
{
	int id;
	String name;
	Employee()
	{
		//default constructor
	}
	Employee(int i,String n)
	{
		//parameterized constructor
		id =i;
		name=n;
	}
	void display()
	{
		System.out.println("Employee Details :\n"+id+" "+name);
	}
}

public class ConstructorEg 
{

	public static void main(String[] args) 
	{
		//calling default constructor
		Employee e = new Employee();
		e.display();
		// calling parameterized
		Employee e1 = new Employee(1,"Abin"); 
		e1.display();
	}

}
