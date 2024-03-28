package phase1.practiceProject12;

public class MyClass 
{
	private static Object obj = new Object();
	
	public static void main(String[] args) throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Thread"+Thread.currentThread().getName()+"was sleeping for 3 seconds");
		
		synchronized(obj)
		{
			obj.wait(2000);
			System.out.println("Object"+obj+"was waiting for 2 seconds");
		}
	}

}
