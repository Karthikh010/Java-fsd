package phase1.practiceProject32;

public class SelectionSort 
{
	public static void sort(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int index = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[index])
					index=j;
			}
			int sml = arr[index];
			arr[index] = arr[i];
			arr[i] = sml;
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {20,40,50,10,30};
		sort(arr);
		
		System.out.println("Sorted array : ");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
