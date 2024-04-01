package phase1.practiceProject23;

public class MultiplyMatrices 
{

	public static int[][] multiply(int[][] first, int[][] second, int r1, int c1, int c2)
	{
		int[][] ans = new int[r1][c2];
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c2; j++)
			{
				for(int k=0; k<c1; k++)
				{
					ans[i][j]+=first[i][k]*second[k][j];
				}
			}
		}
		return ans;
	}
	
	public static void display(int[][] ans)
	{
		System.out.println("The product of the two matrices is:");
		for(int[] row: ans)
		{
			for(int col : row)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int[][] first = { {3, -2, 5}, {3, 0, 4} };
		int[][] second = { {2, 3}, {-9, 0}, {0, 4} };
		display(multiply(first,second,2,3,2));
	}

}
