package phase1.practiceProject5;
import java.util.*;

public class CollectionEg 
{

	public static void main(String[] args) 
	{
		//ArrayList
		ArrayList<Integer> nos = new ArrayList<Integer>();
		nos.add(1);
		nos.add(2);
		nos.add(3);
		System.out.println("ArrayList :\n"+nos);
		
		//LinkedList
	     LinkedList<Double> ll =new LinkedList<>();  
	     ll.add(11.0);
	     ll.add(5.6);
	     ll.add(10.96);
	     System.out.println("LinkedList :\n"+ll);
	      
	      //vector
	      Vector<Integer> vr = new Vector<>();
	      vr.add(10);
	      vr.add(20);
	      vr.add(30);
	      vr.add(40);
	      System.out.println("Vector :\n"+vr);
	      
	      //HashSet
	      HashSet<String> car = new HashSet<>();
	      car.add("Benz");
	      car.add("Audi");
	      car.add("Toyota");
	      car.add("Maruthi");
	      Iterator it = car.iterator();
	      System.out.println("HashSet :");
	      while(it.hasNext())
	      {
	    	  System.out.print(it.next()+", ");
	      }
	      //System.out.println("\n");
	      
	      //LinkedHashSet
	      LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	      lhs.add(44);
	      lhs.addAll(vr);
	      System.out.println("\nLinkedHashSet with size "+lhs.size()+":\n"+lhs);
	      
	      //TreeSet
	      TreeSet<String> name = new TreeSet<>();
	      name.add("Abhi");
	      name.add("Zoya");
	      name.add("Abhi");
	      name.add("Abhiram");
	      name.add("Joel");
	      name.add("Krithi");
	      System.out.println("TreeSet :\n"+name);
	}

}
