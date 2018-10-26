package org.example.JacocoExample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple PalindromeApplication.
 */
public class PalindromeApplicationTest
{
	@Test
	public void testEmptyString()
	{
		PalindromeApplication application = new PalindromeApplication();
		assertTrue(application.isPalindrome(""));
	}
	
	@Test
	public void  whenPalindromeIsTrue()
	{
		PalindromeApplication application = new PalindromeApplication();
		assertTrue(application.isPalindrome("noon"));
	}
	
	@Test
	public void  whenPalindromeIsFalse()
	{
		PalindromeApplication application = new PalindromeApplication();
		assertFalse(application.isPalindrome("neon"));
	}	
}
