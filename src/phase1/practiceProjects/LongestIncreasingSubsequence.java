package phase1.practiceProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence 
{

	public static void main(String[] args) 
	{
		int[] arr = {9,21,8,32,20,49,40,59,61,8};
		
		System.out.println("Given array :");
		for (int a : arr) 
		 {
			 System.out.print(a + " ");
		 }
		System.out.println();
		
		int n = arr.length;
		int[] liss = new int[n];
		Arrays.fill(liss, 1);
		
		 for (int i = 1; i < n; i++) 
		 {
			 for (int j = 0; j < i; j++) 
			 {
				 if(arr[i]>arr[j] && liss[i]<=liss[j])
				 {
					 liss[i]=liss[j]+1;
				 }
			 }
		 }
		 
		 int maxLength = 0;
		 int maxIndex = 0;
		 for(int i=0; i<n;i++)
		 {
			 if(liss[i]>maxLength)
			 {
				 maxLength=liss[i];
				 maxIndex=i;
			 }
		 }
		 
		 List<Integer> lss = new ArrayList<>();
		 int current=maxLength;
		 for(int i = maxIndex; i>=0; i--)
		 {
			 if(liss[i]==current)
			 {
				 lss.add(arr[i]);
				 current--;
			 }
		 }
		 
		 Collections.reverse(lss);
		 
		 System.out.println("Longest increasing subsequence:");
		 for (int a : lss) 
		 {
			 System.out.print(a + " ");
		 }
	}
}
