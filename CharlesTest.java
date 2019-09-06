public class CharlesTest
{
    public static void main(String[] args)
    {
        Charles modify = new Charles();
        modify.setAge(19);
        modify.setheight(180);
        modify.setweight(73);
        modify.setGPA(4.29);
        modify.setgirlfriend(true);
        System.out.println(modify.getAge());
        System.out.println(modify.getheight());
        System.out.println(modify.getweight());
        System.out.println(modify.getGPA());
        System.out.println(modify.getGirlfriend());
    }
}
