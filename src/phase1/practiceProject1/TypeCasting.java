package phase1.practice_Project1;

public class TypeCasting 
{
	public static void main(String[] args)
	{
		//implicit conversion
		System.out.println("Implicit Type Casting");
		
		byte a=11;
		System.out.println("Byte value: "+a);
				
		int b=a;
		System.out.println("Integer value: "+b);
				
		float c=a;
		System.out.println("Floating point value: "+c);
				
		long d=a;
		System.out.println("Long value: "+d);
				
		double e=a;
		System.out.println("Double value: "+e);
		
		//explicit conversion
		System.out.println("\nExplicit Type Casting");
				
		double x=12.3;
		int y=(int)x;
		System.out.println("Double value: "+x);
		System.out.println("Integer value: "+y);

	}
}
