package phase1.practiceProject29;

public class LinearSearch 
{
	int[] arr;
	int data;
	public LinearSearch(int[] arr, int data) 
	{
		super();
		this.arr = arr;
		this.data = data;
	}
	
	public void search()
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]== data)
			{
				System.out.println(data+" is found at "+(i+1));
				System.exit(0);
			}
		}
		System.out.println(data+" is not found.");
	}
}
