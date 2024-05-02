package com.authentication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LoginTest 
{
	private UserLogin authenticator;
	
	@BeforeEach
    void setUp() {
        authenticator = new UserLogin();
    }
	
    @Test
    void testValidAuthentication() {
        assertTrue(authenticator.authenticate("admin", "admin123"));
    }
    
    @Test
    void testInvalidUsername() {
        assertFalse(authenticator.authenticate("asd", "abc123"));
    }
    
    @Test
    void testInvalidPassword() {
        assertFalse(authenticator.authenticate("admin", "admin456"));
    }
    
    @Test
    void testNullUsername() {
        assertFalse(authenticator.authenticate(null, "abc123"));
    }
    
    @Test
    void testNullPassword() {
        assertFalse(authenticator.authenticate("admin", null));
    }
}

