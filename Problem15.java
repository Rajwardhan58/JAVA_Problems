//Accept character from user and check whether that character is vowel or not

import java.lang.*;
import java.util.*;

class Test
{
    public boolean ChkVowel(char ch)
    {
        if((ch=='a')||(ch=='e')||(ch=='o')||(ch=='i')||(ch=='u'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Problem15
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the character");
        char cValue=sobj.next().charAt(0);

        boolean bRet=false;

        Test tobj=new Test();
        bRet=tobj.ChkVowel(cValue);

        if(bRet==true)
        {
            System.out.println("Character is vowel");
        }
        else
        {
            System.out.println("Character is not vowel");
        }
    }
}