import java.util.Scanner;

public class P82
{
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		int counter = 0;
		double adder = 0;
		Pontos2D origin = new Pontos2D();
		Pontos2D max = origin;
		while(true)
		{
			Pontos2D p = setCords();
			if (p.isOrigin()) break;
			counter++;
			double distance = getDistance(origin,p);
			adder += distance;
			if(getDistance(origin,max)<distance) max = p;
		}
		printer(adder,counter,max);
	}
	
	public static Pontos2D setCords()
	{
		System.out.println("Introduza um ponto:");
		System.out.print("Coordenada x: ");
		double x = sc.nextDouble();
		System.out.print("Coordenada y: ");
		double y = sc.nextDouble();
		return new Pontos2D(x,y);
	}
	
	public static double getDistance(Pontos2D p1, Pontos2D p2)
	{
		return (Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)));
	}
	
	public static void printer(double adder, int counter, Pontos2D max)
	{
		System.out.printf("A soma das ditâncias dos %d pontos à origem é %f\nO ponto mais afastado da origem foi: ", counter, adder);
		System.out.print(max.getCords());
	}
}
