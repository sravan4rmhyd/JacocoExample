package org.example.JacocoExample;


public class PalindromeApplication 
{
	public Boolean isPalindrome(String input)
	{
		if(input.length()==0)
		{
			return true;
		} else {
			Character firstChar = input.charAt(0);
			Character lastChar = input.charAt(input.length()-1);
			String nextInput = input.substring(1, input.length()-1);
			return (firstChar==lastChar) && isPalindrome(nextInput);
		}
	}
}