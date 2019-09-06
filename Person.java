public class Person
{
    private String name;
    private double phone;
    public Person(String n, double p)
    {
        name = n;
        phone = p;
    }
    public String getName()
    {
        return name;
    }
    public double getPhone()
    {
        return phone;
    }
    public String toString()
    {
        return "Name: " + name + " Phone: " + phone;
    }
}