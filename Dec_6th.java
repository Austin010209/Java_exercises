public class Dec_6th
{
    public boolean isLevelTrialSegment(int start, int end)
    {
        int minimal = 0;
        int maximal = 0;
        for (int i = 0; i<markers.length; i++)
        {
            if(markers[i] > maximal)
            {
                maximal = marker[i];
            }
            else if (markers[i] < minimal)
            {
                minimal = markers[i];
            }
        }
        if((maximal - minimal)<=10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
