package phase1.practiceProject33;

public class BubbleSort
{

	public static void bsort(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
			for(int j=0; j<arr.length-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
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
		bsort(arr);
	}

}
