public class probability
{
    public static void main(String[] args)
    {
        int firstten = 0;
        int secondten = 0;
        int thridten = 0;
        int fourthten = 0;
        int fifthten = 0;
        int sixthten = 0;
        int seventhten = 0;
        int eightthten = 0;
        int ninthten = 0;
        int tenthten = 0;
        for(int i = 0; i<100000; i++)
        {
            double x = Math.random();
            double y = Math.random();
            double xy = x*y;
            if(xy<0.1)
            {
                firstten++;
            }
            else if(xy>0.1&&xy<0.2)
            {
                secondten++;
            }
            else if(xy>0.2&&xy<0.3)
            {
                thridten++;
            }
            else if(xy>0.3&&xy<0.4)
            {
                fourthten++;
            }
            else if(xy>0.4&&xy<0.5)
            {
                fifthten++;
            }
            else if(xy>0.5&&xy<0.6)
            {
                sixthten++;
            }
            else if(xy>0.6&&xy<0.7)
            {
                seventhten++;
            }
            else if(xy>0.7&&xy<0.8)
            {
                eightthten++;
            }
            else if(xy>0.8&&xy<0.9)
            {
                ninthten++;
            }
            else if(xy>0.9&&xy<1.0)
            {
                tenthten++;
            }
        }
        System.out.println("firstten: " + firstten*0.00001);
        System.out.println("secondten: " + secondten*0.00001);
        System.out.println("thridten: " + thridten*0.00001);
        System.out.println("fourthten: " + fourthten*0.00001);
        System.out.println("fifthten: " + fifthten*0.00001);
        System.out.println("sixthten: " + sixthten*0.00001);
        System.out.println("seventhten: " + seventhten*0.00001);
        System.out.println("eighthten: " + eightthten*0.00001);
        System.out.println("ninthten: " + ninthten*0.00001);
        System.out.println("tenthten: " + tenthten*0.00001);
    }
}
