package phase1.practiceProject10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingRegex {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Java Language");
		if(m.find()== true)
			System.out.println("Pattern matches");
		else
			System.out.println("Pattern is not matching");
		
		System.out.println(Pattern.matches("[a-z]","w"));
		System.out.println(Pattern.matches("[a-z]","ww"));
		System.out.println(Pattern.matches("[a-zA-Z]{2}","Ww"));
	}

}
