//Write a program to accept number from user and display its multiplication of factors

import java.lang.*;
import java.util.*;

class Test
{
    public int Display(int iNo)
    {
        int iMult=1;
        for(int iCnt=2;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iMult=iMult*iCnt;
            }
        }
        return iMult;
    }
}

class Problem16
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");
        int iValue=sobj.nextInt();

        int iRet=0;

        Test tobj=new Test();
        iRet=tobj.Display(iValue);
        System.out.println("Multiplication of factors is "+iRet);
    }
}