import java.util.Scanner;

public class P117
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double cost, cut, iva, quant;       	 	 // Variáveis relativas às notas de cada parâmetro
    double liquid;	 		     		 		 // Variável que guarda o valor da nota final
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.println("Indique o custo de um produto: ");
    cost = sc.nextDouble();
    System.out.println("Indique o valor do desconto (%): ");
    cut = sc.nextDouble();
    System.out.println("Indique a taxa de IVA (%): ");
    iva = sc.nextDouble();
    System.out.println("Indique a quantidade de produtos a ser vendidos: ");
    quant = sc.nextDouble();
    // 2) Calcular a Nota Final
	iva = (iva/100) * cost;
	cut = (cut/100) * (cost+iva);
	liquid = (cost + iva - cut) * quant;
    // 3) Escrever os resultados
    System.out.printf("O total líquido da fatura é: %.2f", liquid);
  }
}
