/******************************************************************************
 *  Author:       Austin ZhangXueyang
 *  Created:      Nov 05, 2018
 *  Last updated: Nov 05, 2018
 *
 *  Compilation:  javac CreditCard.java
 *  Execution:    java CreditCard
 *
 *  This program checks the validity of credit card numbers.
 *
 *  Valid credit card:  AMEX
 *                      MASTERCARD
 *                      VISA
 *                      VALID
 *
 *  Invalid credit card: INVALID
 *
 *  Valid test values:
 *  "378282246310005"   AMEX
 *  "371449635398431"   AMEX
 *  "5555555555554444"  MASTERCARD
 *  "5105105105105100"  MASTERCARD
 *  "4111111111111111"  VISA
 *  "4012888888881881"  VISA
 *  "6451962466988955"  VALID
 *
 *  Invalid test values:
 *  "6176292929"        INVALID
 *  "1234567890314"     INVALID
 *
 ******************************************************************************/
public class CreditCard
{
    public static String validate(String digits)
    {
        // YOUR CODE HERE
        int length = digits.length();
        int[] eachnumber = new int[length];
        int i = 0;
        while (i!= length)
        {
            String k = digits.substring(i,(i+1));
            eachnumber[i] = Integer.parseInt(k);
            i++;
        }
        int normsum1 = 0;
        for (int j = 0; j< length; j+=2)
        {
            normsum1 += eachnumber[j];
        }
        int normsum2 = 0;
        for (int p = 1; p< length; p+=2)
        {
            normsum2 += eachnumber[p];
        }
        int weirdsum1 = 0;
        for (int y = 0; y< length; y+=2)
        {
            weirdsum1 += 2*eachnumber[y];
            if(2*eachnumber[y] >9)
            {
                weirdsum1 -= 9;
            }
        }
        int weirdsum2 = 0;
        for (int q = 1; q< length; q+=2)
        {
            weirdsum2 += 2*eachnumber[q];
            if(2*eachnumber[q] >9)
            {
                weirdsum2 -= 9;
            }
        }
        int sumlasttwo;
        int sumlastone;
        if(length%2 == 1)
        {
            sumlasttwo = weirdsum2;
            sumlastone = normsum1;
        }
        else
        {
            sumlasttwo = weirdsum1;
            sumlastone = normsum2;
        }
        int testingnumber = sumlasttwo + sumlastone;
        boolean result;
        if (testingnumber%10 == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        String finalresult;
        if (result == false)
        {
            finalresult = "INVALID";
        }
        //AMEX, MASTERCARD, VISA, VALID, INVALID
        int length1 = digits.length();
        int digitnumber = Integer.parseInt(digits);
        if(length1 == 15)
        {
            double num3 = digitnumber/(Math.pow(10,13));
            int num4 = (int)num3;
            if (num4 == 34 || num4 == 37)
            {
                finalresult = "AMEX";
            }
            else
            {
                finalresult = "Valid";
            }
        }
        else if(length1 == 13)
        {
            double num5 = digitnumber/(Math.pow(10,12));
            int num6 = (int)num5;
            if(num6 == 4)
            {
                finalresult = "VISA";
            }
            else
            {
                finalresult = "VALID";
            }
        }
        else if(length1 == 16)
        {
            double num7 = digitnumber/(Math.pow(10,14));
            int num8 = (int)num7;
            double num9 =  digitnumber/(Math.pow(10,15));
            int num10 = (int)num9;
            if(num8 == 51 || num8 == 52 || num8 == 53 || num8 == 54 || num8 == 55)
            {
                finalresult = "MASTERCARD";
            }
            else if(num9 == 4)
            {
                finalresult = "VISA";
            }
            else
            {
                finalresult = "VALID";
            }
        }
        else
        {
            finalresult = "VALID";
        }
        return finalresult;
    }
    public static void main(String[] args)
    {
        String result = validate("378282246310005");
        System.out.println(result);
    }
}