package phase1.practiceProject27;

public class Stack 
{
	int max=4;
	int top;
	int[] arr;
	
	Stack(int max)
	{
		this.max=max;
		this.arr= new int[max];
		this.top=-1;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == max;
	}
	
	public void push(int val)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top=top+1;
			arr[top]=val;
			System.out.println(val+" Pushed to the stack.");
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			int s=arr[top];
			top--;
			System.out.println(s+" Popped from the stack.");
		}
	}
	public void display()
	{
		System.out.println("\nThe Stack is: ");
		for(int i=0; i<=top; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.display();
	}
}
