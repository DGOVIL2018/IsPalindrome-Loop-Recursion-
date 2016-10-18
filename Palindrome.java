import java.util.Scanner;

public class Palindrome
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String answer = input.nextLine();
		System.out.println("Value based on loop algorithm is " + isPalindrome(answer));
		System.out.println("Value computed by the recursive function is " + recursivePalindrome(answer));
	
	}

/**
This method takes in a String and returns true if the given String is a palindrome, and false otherwise
Uses iteration and the charAt() method
*/

	public static boolean isPalindrome (String s)
	{
		int z = s.length() ;

		for( int i = 0; i < (z/2); i++)
		{
			if (s.charAt(i) != s.charAt(z - 1 - i))
			{
				return false;	
			}
		}

	
		return true;
	}

/**
This method takes in a String and returns true if the given String is a palindrome, and false otherwise
Uses recursion and the charAt() method
*/

	
	public static boolean recursivePalindrome (String s)
	{
		if (s.length() == 0 || s.length() == 1)
			return true;

		if ( s.charAt(0) != s.charAt(s.length() - 1))
			return false;

		return (recursivePalindrome(s.substring(1, s.length() - 1)));
			
	}




}