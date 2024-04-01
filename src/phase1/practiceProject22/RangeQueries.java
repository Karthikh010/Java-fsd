package phase1.practiceProject22;

public class RangeQueries  
{

	public static int sum(int arr[],int n ,int l , int r)
	{
		int sum=0;
		if(l<0 || r>=n || l>r)
			System.out.println("Invalid range.");
		for(int i=l-1; i<r; i++ )
			sum+=arr[i];
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {2,4,6,8,10,12,14};
		System.out.println("Sum of elements from 2 to 5 :"+sum(arr,arr.length,2,5));
	}

}
