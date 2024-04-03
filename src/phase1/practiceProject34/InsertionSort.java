package phase1.practiceProject34;

public class InsertionSort 
{

	public static void isort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j =i-1;
			while((j>-1) && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		System.out.println("Sorted array : ");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {20,40,50,10,30};
		isort(arr);
	}

}
