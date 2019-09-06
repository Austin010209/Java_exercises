public class landTest
{
    public static void main(String[] args)
    {
        land Austinbike = new bike("bike",1,25,8,"Giant",150,95);
        System.out.println(((bike)Austinbike).brand());
        ((bike)Austinbike).setevaluation(96);
        System.out.println(((bike)Austinbike).getevaluation());
        land Austincar = new privatecar("car",5,100,200,"Benz",35000);
        System.out.println(((privatecar)Austincar).brand());
        System.out.println(((privatecar)Austincar).price(40000));
    }
}