public class Hora
{
	int h;
	int m;
	int s;
	
	public Hora(int h, int m, int s)
	{
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public Hora()
	{
		this.h = 0;
		this.m = 0;
		this.s = 0;
	}
	
	public String getTime()
	{
		return h+":"+m+":"+s;
	}
	
	public static boolean confirmSexuality(int h, int m, int s)
	{
		return ((h >= 0 && h<=23) && (m>=0 && m<=59) && (s>=0 && m<=59));
	}
}
