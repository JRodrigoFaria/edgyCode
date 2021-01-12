import java.util.Scanner;

public class TestaHora
{
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		Hora inicio;  // tem de definir o novo tipo Hora!
		Hora fim;

		inicio = new Hora();
		inicio.h = 9;
		inicio.m = 23;
		inicio.s = 5;

		System.out.print("Começou às ");
		printHora(inicio);  // crie esta função!
		System.out.println(".");
		System.out.println("Quando termina?");
		fim = lerHora();  // crie esta função!
		System.out.print("Início: ");
		printHora(inicio);
		System.out.print(" Fim: ");
		printHora(fim);
	}
	
	public static Hora lerHora()
	{
		int h, m, s;
		do{
		System.out.print("Introduza a hora: ");
		h = sc.nextInt();
		System.out.print("Introduza os minutos: ");
		m = sc.nextInt();
		System.out.print("Introduza os segundos: ");
		s = sc.nextInt();
		}while(Hora.confirmSexuality(h,m,s)==false);
		return new Hora(h,m,s);
	}

	public static void printHora(Hora clock)
	{
		System.out.printf("%02d:%02d:%02d\n", clock.h, clock.m, clock.s);
	}
}
/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
