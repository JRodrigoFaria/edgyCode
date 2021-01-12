import java.util.Scanner;

public class P118
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Letra: ");
    char low = scan.next().charAt(0); // Recebe a primeira letra introduzida pelo utilizador
    int capital = (int)low - 32; 			// Transforma a letra recebida num valor inteiro e subtrai o 32 para transformar a letra na sua maiúscula
    System.out.println((char)capital);
  }
}
