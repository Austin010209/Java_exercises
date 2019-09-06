public class NormalStudent extends NormalPerson
{
    private double GPA;
    private String countrytogo;
    private int TOFEL;
    private boolean physics;
    private boolean biology;
    private int IQ;
    public NormalStudent(int a, String b, int c, double d, boolean i, int k, String l, int m, boolean n,boolean o, int p)
    {
        super(a,b,c,d,i);
        GPA = k;
        countrytogo = l;
        TOFEL = m;
        physics = n;
        biology = o;
        IQ = p;
    }
    public double getGPA()
    {
        return GPA;
    }
    public String getCountrytogo()
    {
        return countrytogo;
    }
    public int getTOFEL()
    {
        return TOFEL;
    }
    public boolean getPhysics()
    {
        return physics;
    }
    public boolean getBiology()
    {
        return biology;
    }
    public int getIQ()
    {
        return IQ;
    }
    public void setGPA(double aa)
    {
        GPA = aa;
    }
    public void setCountrytogo(String ab)
    {
        countrytogo = ab;
    }
    public void setTOFEL(int ac)
    {
        TOFEL = ac;
    }
    public void setPhysics(boolean ad)
    {
        physics = ad;
    }
    public void setBiology(boolean ae)
    {
        biology = ae;
    }
    public void setIQ(int af)
    {
        IQ = af;
    }
}
