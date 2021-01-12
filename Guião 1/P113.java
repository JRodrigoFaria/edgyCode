import java.util.Scanner;

public class P113
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double x1, x2, y1, y2;
    System.out.println("Cordenadas do ponto A");
    System.out.print("x: ");
    x1 = sc.nextDouble();
    System.out.print("y: ");
    y1 = sc.nextDouble();
    System.out.println("Cordenadas do ponto B");
    System.out.print("x: ");
    x2 = sc.nextDouble();
    System.out.print("y: ");
    y2 = sc.nextDouble();
    System.out.printf("A distância entre os pontos A e B é: %f", (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))*100 );
  }
}
