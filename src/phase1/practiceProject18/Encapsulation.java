package phase1.practiceProject18;

class Student
{
	private String name;
	private int age;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}

public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setName("Leo");
		s.setAge(23);
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
	}

}
