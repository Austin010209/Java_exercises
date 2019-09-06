public class DogTest
{
    public static void main(String[] args)
    {
        Pet animal = new Dog(12,"Ann");
        System.out.println(animal.getName());
        System.out.println(((Dog)animal).bark());
        System.out.println(((Dog)animal).getNName());
    }
}
