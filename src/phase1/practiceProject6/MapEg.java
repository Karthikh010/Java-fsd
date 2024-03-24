package phase1.practiceProject6;
import java.util.*;

public class MapEg 
{

	public static void main(String[] args) 
	{
		//HashMap
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1,"Abc");
		hm.put(2,"Def");
		hm.put(3,"Ghi");
		System.out.println("HashMap :\n"+hm);
		
		//TreeMap
		TreeMap<String,String> tm = new TreeMap<>();
		tm.put("A","Length");
		tm.put("B","Breadth");
		tm.put("C","Height");
		System.out.println("Values of TreeMap of size "+tm.size()+" :");
		for(String s: tm.values())
		{
			System.out.print(s+", ");
		}
		
		//Hashtable
		Hashtable<Integer, String> ht  = new Hashtable<>();
		ht.put(4, "Jkl");
		ht.put(5,"Mno");
		ht.putAll(hm);
		System.out.println("\nHashtable :\n"+ht);
	}

}
