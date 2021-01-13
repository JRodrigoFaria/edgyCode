import java.util.Scanner;
import java.io.*;

public class P114
{
    public static final Scanner sc = new Scanner(System.in);
    
    public static double[] weights = new double[3];

    public static void main(String[] args) throws IOException
    {
        Student[] plebs = new Student[20];
        weights[0] = 33;
        weights[1] = 33;
        weights[2] = 34;

        while(true)
        {
            switch (menu())
            {
                case 1:
                    System.out.print("How many plebs? ");
                    plebs = new Student[sc.nextInt()];
                    System.out.println("Add their info:");
                    for (int i = 0; i < plebs.length; i++) plebs[i] = setAluno();
                    setMarks(plebs);
                    break;
                case 2:
                    System.out.print("Which student? ");
                    System.out.println(plebs[sc.nextInt()-1].getAluno());
                    break;
                case 3:
                    System.out.print("Which student? ");
                    plebs[sc.nextInt()-1] = setAluno();
                    break;
                case 4:
                    for (int i = 0; i < plebs.length; i++) System.out.println(plebs[i].getAluno());
                    break;
                case 5:
                    printOrder(plebs);
                    break;
                case 6:
                    System.out.printf("The average mark is: %.3f\n",getAverage(plebs));
                    break;
                case 7:
                    whosBest(plebs);
                    break;
                case 8:
                    setWeight(plebs);
                    break;
                case 9:
					saveData(plebs);
					break;
                case 0: System.exit(0);
            }
        }
    }
	
    public static int menu()
    {
        System.out.printf("\nClass management:\n");
        System.out.println("1 - Insert class info");
        System.out.println("2 - Show the info of one student");
        System.out.println("3 - Change the info of one student");
        System.out.println("4 - List the students");
        System.out.println("5 - List the students ordered by their final mark");
        System.out.println("6 - Average of the final marks");
        System.out.println("7 - Best student");
        System.out.println("8 - Insert weights of all the tests");
        System.out.println("9 - Save class data on a file");
        System.out.println("0 - End program");
        System.out.printf("\nOption? ");
        return sc.nextInt();
    }

    public static void setWeight(Student[] plebs)
    {
        double[] weightsTemp = new double[3];
        for(int i = 0; i < weightsTemp.length; i++)
        {
            System.out.printf("Weight of test number %d: ", i + 1);
            weightsTemp[i] = sc.nextDouble();
        }
        if((weightsTemp[0] + weightsTemp[1] + weightsTemp[2]) == 100) for(int i = 0; i < weightsTemp.length; i++) weights[i] = weightsTemp[i];
        setMarks(plebs);
    }

    public static Student setAluno()
    {
        System.out.print("Mec: ");
        int mec = sc.nextInt();
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Tests: ");
        double[] tests = new double[3];
        for(int i = 0 ; i < 3 ; i++) tests[i]=sc.nextInt();
        return new Student(mec,name,tests);
    }
	
    public static void setMarks(Student[] plebs)
    {
        for(int i = 0; i < plebs.length; i++) plebs[i].setMark(weights);
    }

    public static void printOrder(Student[] plebs)
    {
        Student[] newOrder = new Student[plebs.length];
        newOrder = plebs;
        Student aux;
        for (int i = 0; i < newOrder.length-1; i++)
        {
            if (plebs[i].mark > plebs[i+1].mark)
            {
                aux = plebs[i];
                newOrder[i] = plebs[i+1];
                plebs[i+1] = aux;
            }
        }
        for (int i = 0; i< newOrder.length; i++) System.out.println(newOrder[i].getAluno());
    }

    public static double getAverage(Student[] plebs)
    {
        double marks = 0;
        for (int i = 0; i < plebs.length; i++) marks += plebs[i].getMark();
        return (marks/plebs.length);
    }

    public static void whosBest(Student[] plebs)
    {
        Student best = plebs[0];
        for (int i = 1; i < plebs.length; i++) if (plebs[i].mark > best.mark) best=plebs[i];
        System.out.println(best.getAluno());
    }
    
    public static void saveData(Student[] plebs) throws IOException
    {
		System.out.print("Insert the name of the file: ");
		sc.nextLine();
		File output = new File(sc.nextLine());
		PrintWriter printer = new PrintWriter(output);
		for (int i = 0; i < plebs.length; i++) printer.println(plebs[i].getAluno());
		printer.close();
	}
}
