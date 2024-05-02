package com.authentication;

import java.util.HashMap;
import java.util.Map;

public class UserLogin 
{
	 private Map<String, String> users; // Simulated user database
	    
	 public UserLogin() 
	 {
		 users = new HashMap<>();
		 users.put("admin", "admin123");
		 users.put("abc", "abc123");
	     users.put("xyz", "xyz456");   
	 }
	 public boolean authenticate(String username, String password) 
	 {
		 return users.containsKey(username) && users.get(username).equals(password);
	 }
}
