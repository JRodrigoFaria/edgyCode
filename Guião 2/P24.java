import java.util.Scanner;

public class P24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza as cordenadas de 4 pontos");
		System.out.print("x(P1): ");
		double x1 = sc.nextDouble();
		System.out.print("y(P1): ");
		double y1 = sc.nextDouble();
		System.out.print("x(P2): ");
		double x2 = sc.nextDouble();
		System.out.print("y(P2): ");
		double y2 = sc.nextDouble();
		System.out.print("x(P3): ");
		double x3 = sc.nextDouble();
		System.out.print("y(P3): ");
		double y3 = sc.nextDouble();
		System.out.print("x(P4): ");
		double x4 = sc.nextDouble();
		System.out.print("y(P4): ");
		double y4 = sc.nextDouble();
		String yn = (((Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))) == (Math.sqrt(Math.pow((x3-x2),2)) + Math.pow((y3-y2),2))) == ((Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2))) == (Math.sqrt(Math.pow((x1-x4),2) + Math.pow((y1-y4),2))))) ? "Os pontos formam um quadrado" : "Os pontos não formam um quadrado";
		System.out.println(yn);
	}
}
