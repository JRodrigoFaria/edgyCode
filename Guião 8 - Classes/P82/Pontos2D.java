public class Pontos2D
{
	double x;
	double y;
	
	public Pontos2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Pontos2D()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public String getCords()
	{
		return "(" + x + ", " + y + ")";
	}
	
	public boolean isOrigin()
	{
		return ((x == 0) && (y == 0));
	}
}
