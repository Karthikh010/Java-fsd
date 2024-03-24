package phase1.practiceProject9;

public class Arrays {

	public static void main(String[] args) 
	{
		//Single Dimensional array
		int n[] = new int[5];
		n[0]=10;
		for(int i=1;i<5;i++)
		{
			n[i]=i*10;
		}
		System.out.println("Array : ");
		for(int j=0;j<5;j++)
		{
			System.out.print(n[j]+", ");
		}
		
		//Two dimensional array
		String[][] strArray = {{"Abc","De","Fg"},{"Hi","Jkl"},{"Mnop"}};
		System.out.println("\nElement in the second row, second column is "+strArray[1][1]);
		System.out.println("Length of first row : "+strArray[0].length);
		
	}

}
