import java.util.Scanner;

public class P62
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.print("Number List: ");
		for(int i = 0; i < size; i++) array[i] = sc.nextInt();
		if (getNumber() > 0) checkRepeats(array, TAM, i);
	}

	private static void checkRepeats(int[] array, int TAM, int num)
	{
		int counter = 0;
		for(int i = 0; i < size; i++) if(array[i] == getNumber(num)) counter++;

		System.out.println("The number " + num + " appears " + counter + " times in the list.");
	}
	
	public static int getNumber()
	{
		int num = sc.nextInt();
		return num;
	}
}
