class Time
{
    public int hour, minute;
    public double second;
    public Time()
    {
        hour = 0;
        minute = 0;
        second = 0.0;
    }
    public String toString()
    {
        String k = hour+ ":" + minute + ":" + second;
        return k;
    }
}
