package phase1.practiceProject18;

public class OopsEg 
{
	int n1;
	int n2;
	int sum;

	public OopsEg(int n1, int n2) 
	{
		super();
		this.n1 = n1;
		this.n2 = n2;
		sum=n1+n2;
	}

	public int getN1() {
		return n1;
	}



	public void setN1(int n1) {
		this.n1 = n1;
	}



	public int getN2() {
		return n2;
	}



	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return n1 + " + " + n2 + " = "+ sum;
	}

	public static void main(String[] args) 
	{
		OopsEg sum = new OopsEg(5,4);
		System.out.println(sum.toString());
	}

}
