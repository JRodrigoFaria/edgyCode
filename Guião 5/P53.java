import java.util.Scanner;

public class P53
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
		if (bissex(year) && month==2) System.out.printf("O mês tem %d dias", (monthDayCheck(month)+1));
		else System.out.printf("O mês tem %d dias", (monthDayCheck(month)));
	}
	
	public static boolean bissex(int year)
	{
		return ((year%4)==0);
	}
	
	public static int monthDayCheck(int month)
	{
		if (month>0 && month<=12)
		{
		if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
		else if (month == 2) return 28;
		else return 31;
		}else return 0;
	}
}
