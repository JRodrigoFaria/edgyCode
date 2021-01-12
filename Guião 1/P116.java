import java.util.Scanner;

public class P116
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double cd1, cd2, cd3, cd4;       	 // Variáveis relativas às notas de cada parâmetro
    double average;	 		     		 // Variável que guarda o valor da nota final
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.println("Custos relativos ao primeiro dia (em euros): ");
    cd1 = sc.nextDouble();
    cd2 = cd1 + cd1*0.20;
    cd3 = cd2 + cd2*0.20;
    cd4 = cd3 + cd3*0.20;
    // 2) Calcular a Nota Final
	average = (cd1 + cd2 + cd3 + cd4)/4;
    // 3) Escrever os resultados
    System.out.printf("A média de dinheiro gasto por dia foi: %.2f", average);
  }
}
