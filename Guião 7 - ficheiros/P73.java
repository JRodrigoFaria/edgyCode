import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class P73
{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int counter = 0;
		int option = 0;
		int[] list = null; 
		do
		{
			printOptions();
			option = sc.nextInt();
			switch (option)
			{
				case 1: list = readSequence(); break;
				case 2: typeSequence(list); break;
				case 3: System.out.printf("O maior valor do array é: %d\n",getMax(list)); break;
				case 4: System.out.printf("O menor valor do array é: %d\n",getMin(list)); break;
				case 5: System.out.printf("A média dos valores do array é: %f.3\n",getAverage(list)); break;
				case 6: System.out.printf(checkIfOdds(list) ? "O array só tem números pares\n":"O array tem números ímpares\n"); break;
				case 10: break;
			}
		}
		while (true);
	}
	
	public static int[] readSequence()//define o array
	{
		System.out.print("Qual o tamanho do array: ");
		int size = sc.nextInt();
		System.out.println("Insira os valores do array:");
		int[] list = new int[size];
		for (int i=0; i<size; i++) list[i] = sc.nextInt();
		return list;
	}

	public static void typeSequence(int[] list)//printa o array
	{
		if(list.length == 0 || list == null) return;
		for (int i:list) System.out.printf("%d ",i);
		System.out.println("");
	}
	
	public static int getMax(int list[])//devolve o valor máximo do array
	{
		int max = list[0];
		for (int i:list) if (max < i) max = i;
		return max;
	}
	
	public static int getMin(int[] list)//devolve o valor mínimo do array
	{
		int min = list[0];
		for (int i:list) if (min > i) min = i;
		return min;
	}
	
	public static double getAverage(int[] list)//calcula a média dos valores do array
	{
		double sum = 0;
		for (int i:list) sum += i;
		return (sum/list.length);
	}

	public static boolean checkIfOdds(int[] list)//ver se só tem números pares
	{
		for (int i:list) if (i%2==1) return false;
		return true; 
	}

	public static void printOptions()
	{
		System.out.println("1 - Ler uma sequência de números inteiros");
		System.out.println("2 - Escrever uma sequência");
		System.out.println("3 - Calcular o máximo da sequência");
		System.out.println("4 - Calcular o mínimo da sequência");
		System.out.println("5 - Calcular a média da sequência");
		System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("10 - Terminar o programa");
		System.out.print("Opção -> ");
	}
}

