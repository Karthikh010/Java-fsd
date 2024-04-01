package phase1.practiceProject20;

class RotateArray
{
	public int[] rotate(int[] arr, int k)
	{
		if(k>arr.length)
			k=k%arr.length;
		int[] ans = new int[arr.length];
		
		for(int i =0; i<k; i++)
		{
			ans[i]=arr[arr.length-k+i];
		}
		int j=0;
		for(int i=k; i<arr.length; i++)
		{
			ans[i]=arr[j];
			j++;
		}
		return ans;
	}
}

public class Main {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		RotateArray r = new RotateArray();
		int[] ans = r.rotate(arr, 5);
		for(int n : ans)
		{
			System.out.print(n+" ");
		}
	}

}
