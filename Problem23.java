//Write a program which accept number from user and count frequency of 2 in it

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
            if(iDigit==2)
            {
                iCnt++;
            }
            iNo=iNo/10;
        }
        return iCnt;
    }
}

class Problem23
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