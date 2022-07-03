//Write a program which accept number from user and Display its digit in reverse order

import java.lang.*;
import java.util.*;

class Test
{
    public int Reverse(int iNo)
    {
        int iDigit=0;
        int iSum=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            iSum=iSum*10+iDigit;
            iNo=iNo/10;
        }
        return iSum;
    }
}

class Problem21
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        int iRet=0;
        iRet=tobj.Reverse(iValue);        
        System.out.println("Reverse number is "+iRet);
    }
}