public class TrialTest
{
    public static void main(String[] args)
    {
        Star Kevin = new Star(178,"Kevin",4.25,false);
        int answer1 = Kevin.getHeight();
        String answer2 = Kevin.getName();
        boolean answer3 = Kevin.getSmart();
        int answer4 = Kevin.getAge();
        Kevin.setAge(19);
        Kevin.setSmart(true);
        int Answer1 = Kevin.getAge();
        boolean Answer2 = Kevin.getSmart();
        System.out.println(answer1 + answer2 + answer3 + answer4 + Answer1 + Answer2);
    }
}
