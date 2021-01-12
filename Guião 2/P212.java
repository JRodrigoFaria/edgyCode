import java.util.Scanner;

public class P25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza as cordenadas dos cantos superior esquerdo e inferior direito dos seus dois quadrados, respectivamente");
        System.out.print("x(superior esquerdo): ");
        double l1x = sc.nextDouble();
        System.out.print("y(superior esquerdo): ");
        double l1y = sc.nextDouble();
        System.out.print("x(inferior direito): ");
        double r1x = sc.nextDouble();
        System.out.print("y(inferior direito): ");
        double r1y = sc.nextDouble();
        System.out.println("Quadrado 2");
        System.out.print("x(superior esquerdo): ");
        double l2x = sc.nextDouble();
        System.out.print("y(superior esquerdo): ");
        double l2y = sc.nextDouble();
        System.out.print("x(inferior direito): ");
        double r2x = sc.nextDouble();
        System.out.print("y(inferior direito): ");
        double r2y = sc.nextDouble();
		String yn = ((l1x >= r2x || l2x >= r1x) || (l1y <= r2y || l2y <= r1y)) ? "Os quadrados não se intersetam" : "Os quadrados intersetam-se";
		System.out.println(yn);
    }
}
