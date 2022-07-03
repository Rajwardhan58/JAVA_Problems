//Accept one character from user and convert case of that character.

import java.lang.*;
import java.util.*;

class Test
{
    public char ConvertCase(char ch)
    {
        if((ch>='a')&&(ch<='z'))
        {
            //ch=Character.toUpperCase(ch);
            ch=(char)(ch-32);
        }
        else if((ch>='A')&&(ch<='Z'))
        {
            //ch=Character.toLowerCase(ch);
            ch=(char)(ch+32); 
        }
        return ch;
    }
}

class Problem14
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter a character");
        char cValue=sobj.next().charAt(0);

        char cRet;
        Test tobj=new Test();
        cRet=tobj.ConvertCase(cValue);

        System.out.println("Converted case is "+cRet);
    }
}