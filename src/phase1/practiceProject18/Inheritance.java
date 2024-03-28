package phase1.practiceProject18;

class Area
{
	public double calculateArea()
	{
		return 0;
	}
}

class Triangle extends Area
{
	private double base;
    private double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() 
    {
        return 0.5 * base * height;
    }
}

class Rectangle extends Area 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() 
    {
        return length * width;
    }
}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		Triangle t = new Triangle(5, 8);
        System.out.println("Area of Triangle: " + t.calculateArea());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + r.calculateArea());
	}

}
