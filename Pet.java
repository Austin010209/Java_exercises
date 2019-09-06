public class Pet
{
    private int age;
    private String name;
    public Pet(int a, String b)
    {
        age = a;
        name = b;
    }
    public void increaseAge()
    {
        age++;
    }
    public String getName()
    {
        return name;
    }
}
