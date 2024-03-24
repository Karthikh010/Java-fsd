package phase1.practiceProjects;

import java.util.Scanner;
import java.util.regex.*;

public class EmailValidation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] eIds = {"john@abc.com","aby123@abc.com","kiran1991@abc.com","yasir@abc.com",
						"suresh.1@abc.com","zak5.a@abc.com"};
		
		System.out.print("Enter the email ID to search: ");
		String sid = sc.next();
		
		String emailRegex = "^[a-zA-Z0-9._%+-]+@abc\\.com$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(sid);
        
        if(matcher.matches()== true)
        {
        	int flag = 0;
    		
    		for(String s : eIds)
    		{
    			if(s.equalsIgnoreCase(sid))
    			{
    				System.out.println("The given Email ID is present.");
    				flag++;
    				break;
    			}
    		}
    		if(flag==0)
    			System.out.println("The given Email ID is not present.");
        }
        else
        	System.out.println("Enter valid email id!");
	
		sc.close();
	}

}
