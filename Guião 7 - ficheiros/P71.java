import java.util.Scanner;
import java.io.*;

public class P71
{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) throws IOException
	{
		File file = setFileName();
		if (file.canRead()) 
		{
			System.out.println("I can ,indeed, read the file. Look:");
			Scanner filer = new Scanner(file);
			while(filer.hasNextLine()) System.out.println(filer.nextLine());
		}
		else System.out.print("I can't breath! I mean... read... yeah, read.");
	}
	
	public static File setFileName()
	{
		System.out.print("Insert File Name: ");
		File file = new File(sc.nextLine());
		if (file.isFile()) return file;
		else return setFileName();
	}
}
