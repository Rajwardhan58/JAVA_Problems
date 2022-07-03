//Wrte a program which accept number from user and display its factor in decresing order

import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int iNo)
    {
        for(int iCnt=(iNo/2);iCnt>=2;iCnt--)
        {
            if(iNo%iCnt==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Problem17
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");
        int iValue=sobj.nextInt();

        int iRet=0;

        Test tobj=new Test();
        tobj.Display(iValue);
    }
}