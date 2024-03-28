package phase1.practiceProject18;

abstract class Shape 
{
    public abstract double calculateArea();
}

interface Drawable 
{
    void draw();
}

class Square extends Shape implements Drawable 
{
    private double side;

    public Square(double side) 
    {
        this.side = side;
    }
    
    @Override
    public double calculateArea() 
    {
        return side * side;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing Square with side " + side);
    }
}


public class Abstraction 
{
	public static void main(String[] args) 
	{
		 Square square = new Square(5);
	     System.out.println("Area of Square: " + square.calculateArea());
	     square.draw();
	}
}
