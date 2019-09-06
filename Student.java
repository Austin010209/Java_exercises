public class Student extends Person
{
    private int grade;
    private String school;
    public Student(String n, double p, int g, String s)
    {
        super(n,p);
        grade = g;
        school = s;
    }
    public int getGrade()
    {
        return grade;
    }
    public String getSchool()
    {
        return school;
    }
    //technically we can do this below
    public String contactInformation()
    {
        return super.getName();
    }
    public String toString()
    {
        String result = super.toString();
        result += " Grade: " + grade + " School: " + school;
        return result;
    }
}