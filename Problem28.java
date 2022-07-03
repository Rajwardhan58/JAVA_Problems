//Write a program which accept number from user and return the count digits in between 3 and 7

import java.lang.*;
import java.util.*;

class Test
{
    public int Count(int iNo)
    {
        int iDigit=0;
        int iCnt=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if((iDigit>3)&&(iDigit<7))
            {
                iCnt++;
            }
            iNo=iNo/10;
        }
        return iCnt;
    }
}

class Problem28
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        int iRet=0;
        iRet=tobj.Count(iValue); 
        System.out.println("count is "+iRet);
    }
}