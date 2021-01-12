import java.util.Scanner;

public class P29
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a value for temperature: ");
		double val1 = sc.nextDouble();
		System.out.print("Was the value introduced Fahrenheit or Celsius? (f/c) ");
		char scale = sc.next().charAt(0);
		System.out.println(scale);
		if ((scale == 'c') || (scale == 'C'))
		{
			double val2 = 1.8*val1 + 32;
			System.out.printf("%5.2fºC são %5.2fºF", val1, val2);
		}else if ((scale == 'f') || (scale == 'F'))
		{
			double val2 = (val1-32)/1.8;
			System.out.printf("%5.2fºF são %5.2fºC", val1, val2);
		}else
		{
			System.out.println("Please use F or C as requested");
		}	
	}
}
