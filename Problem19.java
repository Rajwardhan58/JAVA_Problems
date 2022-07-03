//Write a program which accept number from user and return summation of its non factors

import java.lang.*;
import java.util.*;

class Test
{
    public int Summation(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        int iSum=0;
        for(int iCnt=2;iCnt<=iNo;iCnt++)
        {
            if(iNo%iCnt!=0)
            {
                iSum=iSum+iCnt;
            }
        }
        return iSum;
    }
}

class Problem19
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        int iRet=0;
        iRet=tobj.Summation(iValue);        
        System.out.println("Summation of all non factors is "+iRet);
    }
}