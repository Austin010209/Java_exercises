public class DieTest
{
    public static void main(String[] args)
    {
        Die1 cube = new Die1();
        cube.roll();
        int num_facevalue = cube.getFaceValue();
        int num_getcou = cube.getcou();
        int value_zhenbucuo = cube.getzhenbucuo();
        System.out.println("num of facevalue: " + num_facevalue);
        System.out.println("cou: 348? " + num_getcou);
        System.out.println("value of zhenbucuo, 大于cou: " + value_zhenbucuo);
        System.out.println(cube.toString());
    }
}