public class DNATranscription
{
    public static String antiSenseGenerate(String sense)
    {
        int length = sense.length();
        int i = 0;
        String Anti_sense = "";
        while(i != length)
        {
            String substring = sense.substring(i,(i+1));
            if(substring.equals("G"))
            {
                String newpiece1 = "C";
                Anti_sense = Anti_sense + newpiece1;
                i ++;
            }
            else if(substring.equals("C"))
            {
                String newpiece2 = "G";
                Anti_sense = Anti_sense + newpiece2;
                i ++;
            }
            else if(substring.equals("A"))
            {
                String newpiece3 = "T";
                Anti_sense = Anti_sense + newpiece3;
                i ++;
            }
            else if(substring.equals("T"))
            {
                String newpiece4 = "A";
                Anti_sense = Anti_sense + newpiece4;
                i ++;
            }
        }
        return Anti_sense;
    }
    
    public static String mRNAGenerate(String antiSense)
    {
        int length1 = antiSense.length();
        int j = 0;
        String mRNA = "";
        while(j != length1)
        {
            String substring1 = antiSense.substring(j,(j+1));
            if(substring1.equals("G"))
            {
                String newpiece11 = "C";
                mRNA = mRNA + newpiece11;
                j ++;
            }
            else if(substring1.equals("C"))
            {
                String newpiece21 = "G";
                mRNA = mRNA + newpiece21;
                j ++;
            }
            else if(substring1.equals("A"))
            {
                String newpiece31 = "U";
                mRNA = mRNA + newpiece31;
                j ++;
            }
            else if(substring1.equals("T"))
            {
                String newpiece41 = "A";
                mRNA = mRNA + newpiece41;
                j ++;
            }
        }
        return mRNA;
    }
    
    public static String matureTranscription(String rna)
    {
        int GU = rna.indexOf("GU");
        int AG = rna.indexOf("AG");
        int length2 = rna.length();
        int k = 0;
        String matureTranscription = "";
        while(k != length())
        {
            String substring2 = rna.substring(k,(k+1));
            if (substring2.equals("G"))
            {
                String substring3 = rna.substring((k+1),(k+2);
                if(substring3.equals("U")
                {
                    int x = 0;
                    
                    while()
                        String substring4 = rna.substring((k+x),(k+x+1));
        return "";
    }
    
    public static void main(String[] args)
    {
        String sense = "GACCGTAGTA";
        System.out.println("Sense: " + sense);
        
        String antiSense = antiSenseGenerate(sense);
        System.out.println("Anti-sense: " + antiSense);
        
        String mRNA = mRNAGenerate(antiSense);
        System.out.println("mRNA: " + mRNA);
        
        String mature = matureTranscription(mRNA);
        System.out.println("mature mRNA: " + mature);
    }
}