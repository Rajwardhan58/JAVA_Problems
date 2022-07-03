// Program to divide two numbers

import java.lang.*;
import java.util.*;

class Test
{

    public int Divide(int iNo1,int iNo2)
    {
        int iAns=0;
        
        if(iNo2<=0)
        {
            return -1;
        }
        iAns=iNo1/iNo2;
        return iAns;
    }
    
}

class Problem1
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the first number");
        int iValue1=sobj.nextInt();
        System.out.println("Enter the second number");
        int iValue2=sobj.nextInt();

        int iRet=0;

        Test tobj=new Test();
        iRet=tobj.Divide(iValue1,iValue2);

        if(iRet==-1)
        {
            System.out.println("Invalid second number");
        }
        else
        {
            System.out.println("Division is "+iRet);
        }

    }
}