package phase1.practiceProject8;

public class Strings 
{

	public static void main(String[] args) 
	{
		String str = "Hi All";
		
		//Length of the string
		System.out.println("Lenght of the String : "+str.length());
		System.out.println(str);
		if(!str.isEmpty())
		{
			//convert to lower case
			System.out.println(str.toLowerCase());
		}
		System.out.println(str.replace(" ","."));
		
		//StringBuffer
		StringBuffer sb = new StringBuffer(str);
		sb.append(" How Are you.");
		System.out.println(sb);
		System.out.println(sb.delete(3,7));
		
		//StringBuilder
		StringBuilder sbu = new StringBuilder(str);
		System.out.println(sbu.insert(3,"Welcome "));
		System.out.println(sbu.reverse());
		
	}

}
