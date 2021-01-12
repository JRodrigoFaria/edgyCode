import java.util.Scanner;

public class P91
{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		printer(sc.nextLine());
	}
	
	public static void printer(String line)
	{
		int upChars = 0;
		int lowChars = 0;
		int charQuant = 0;
		int vowelCount = 0;
		int nonVowelCount = 0;
		for (int i = 0; i < line.length(); i++)
		{
			if(Character.isUpperCase(line.charAt(i))) upChars++;
			else if(Character.isLowerCase(line.charAt(i))) lowChars++;
			else if(Character.isDigit(line.charAt(i))) charQuant++;
			if(isVowel(line.charAt(i))) vowelCount++;
			else if(isLetter(line.charAt(i))) nonVowelCount++;
		}
		System.out.printf("Sentence -> %s\nNumber of lower case characters-> %d\nNumber of upper case characters -> %d\nNumber of numerical characters -> %d\nNumber of vowels -> %d\nNumber of consonants -> %d",line, upChars, lowChars, charQuant, vowelCount, nonVowelCount);
	}

	public static boolean isVowel(char c)
	{
		c = Character.toLowerCase(c);
		return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
	}
	
	public static boolean isLetter(char c)
	{
		return (((int)c<=122&&(int)c>=97)||((int)c<=90&&(int)c>=65));
	}
}
