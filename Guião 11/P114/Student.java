public class Student
{
    int mec;
    String name;
    double[] tests = new double[3];
    double mark = 0;

    public Student(int mec, String name, double[] tests)
    {
        this.mec = mec;
        this.name = name;
        this.tests = tests;
        this.mark = 0;
    }

    public String getAluno()
    {
        return "mec: "+mec+" | name: "+name+" | tests: "+tests[0]+" / "+tests[1]+" / "+tests[2]+" | mark: "+mark;
    }

    public double getMark()
    {
        return this.mark;
    }

    public void setMark(double[] weights)
    {
        this.mark = ((this.tests[0] * weights[0]) +  (this.tests[1] * weights[1]) + (this.tests[2] * weights[2]))/100;
    }
}
