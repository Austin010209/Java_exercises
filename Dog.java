public class Dog extends Pet
{
    public Dog(int a, String b)
    {
        super(a,b);
    }    
    public String bark()
    {
        return "ruff,ruff";
    }
    public String getNName()
    {
        String k = super.getName();
        return k + "ghj";
    }
}
