import java.util.Scanner;

public class P115
{
  public static void main(String[] args)
  {
    // Scanner para leitura de dados do teclado
    Scanner sc = new Scanner(System.in);
    double tp1,tp2,ttp1,ttp2,ttp3,qa;       	 // Variáveis relativas às notas de cada parâmetro
    double mark;	 		     				 // Variável que guarda o valor da nota final
    // 1) Ler os dados (sem validar, por enquanto)
    System.out.println("Cálculo da nota final relativa à cadeira de Programação I");
    System.out.println("Nota do Teste Prático 1: ");
    tp1 = sc.nextDouble();
    System.out.println("Nota do Teste Prático 2: ");
    tp2 = sc.nextDouble();
    System.out.println("Nota do Teste Teórico-Prático 1: ");
    ttp1 = sc.nextDouble();
    System.out.println("Nota do Teste Teórico-Prático 2: ");
    ttp2 = sc.nextDouble();
    System.out.println("Nota do Teste Teórico-Prático 3: ");
    ttp3 = sc.nextDouble();
    System.out.println("Nota Média das Questões Aula: ");
    qa = sc.nextDouble();
    // 2) Calcular a Nota Final
	mark = (tp1*0.25) + (tp2*0.35) + (ttp1*0.10) + (ttp2*0.10) + (ttp3*0.10) + (qa*0.10);
    // 3) Escrever os resultados
    System.out.printf("A nota final relativa a esta cadeira é: %.2f", mark);
  }
}
