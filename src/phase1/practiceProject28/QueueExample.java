package phase1.practiceProject28;

import java.util.*;

public class QueueExample 
{

	public static void main(String[] args) 
	{
		Queue<Integer> qi = new LinkedList<>();
		qi.add(10);
		qi.add(20);
		qi.add(30);
		qi.add(40);
		qi.add(50);
		System.out.println("Displaying Queue :"+qi);
		qi.remove();
		qi.remove();
		System.out.println("Displaying Queue after dequeue :"+qi);
	}

}
