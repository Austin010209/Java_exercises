public class StudentTest
{
    public static void main(String[] args)
    {
        Student billy = new Student("Billy", 92837, 11, "BNDS");
        System.out.println(billy);
        System.out.println(billy.getName());
        System.out.println(billy.getPhone());
        System.out.println(billy.contactInformation());
    }
}