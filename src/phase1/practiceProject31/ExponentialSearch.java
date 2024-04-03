package phase1.practiceProject31;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch 
{

	public static void search(int[] arr, int data)
	{
		if(arr[0]==data)
		{
			System.out.println(data+" is found at position 1");
			System.exit(0);

		}
		int i =1;
		while(i<arr.length && arr[i]<=data)
			i*=2;
		int pos=0;
		pos = Arrays.binarySearch(arr, i/2, Math.min(i,arr.length),data);
		
		if(pos<0)
			System.out.println(data+" is not found");
		else
			System.out.println(data+" is found at position "+(pos+1));

	}
	
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched : ");
		int data = sc.nextInt();
		
		search(arr,data);
		
		sc.close();
	}

}
