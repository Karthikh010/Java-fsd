package phase1.practiceProject29;

import java.util.Scanner;

public class MainLS 
{

	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched : ");
		int data = sc.nextInt();
		
		LinearSearch ls = new LinearSearch(arr,data);
		ls.search();
		sc.close();
	}

}
