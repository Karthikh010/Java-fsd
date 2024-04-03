package phase1.practiceProject30;

import java.util.Scanner;

public class BinarySearch 
{
	public static void binarySearch(int arr[],int first,int last, int data)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<data)
			{
				first=mid+1;
			}
			else if(arr[mid]==data)
			{
				System.out.println(data+" is found at position "+(mid+1));
				break;
			}
			else
			{
				last=mid-1;
			}
			
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println(data+" is not found.");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched : ");
		int data = sc.nextInt();
		
		binarySearch(arr,0,arr.length-1,data);
		
		sc.close();
	}
}
