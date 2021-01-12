import java.util.Scanner;

public class P114
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double a,b;       	 		 // Variável do tamanho dos catetos
    double c,angle;	 		     // Variável do tamanho da hipotenusa
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.println("Cálculo do comprimento da hipotenusa de um triângulo retângulo");
    System.out.println("Comprimento do primeiro cateto(lado A): ");
    a = sc.nextDouble();
    System.out.println("Comprimento do segundo cateto(lado B): ");
    b = sc.nextDouble();
    // 2) Calcular a distância
    c= Math.sqrt(Math.pow(a,2)+Math.pow((b),2));
    angle= Math.acos(a/c);
    angle= 57.295779513*angle;
    // 3) Escrever os resultados
    System.out.printf("A hipotenusa do triângulo mede: %.2f e o lado A forma, com a hipotenusa, um ângulo de %.2f graus", c, angle);
  }
}
