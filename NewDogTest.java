public class NewDogTest
{
    public static void main(String[] args)
    {
        Dog animal = new Dog(12,"Ann");
        System.out.println(animal.getNName());
        System.out.println(animal.bark());
    }
}
