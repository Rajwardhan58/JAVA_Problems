//Write a program which accept number from user and return difference between summetion of even digits and summetion of odd digits

import java.lang.*;
import java.util.*;

class Test
{
    public int Difference(int iNo)
    {
        int iDigit=0;
        int iSum1=0,iSum2=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit%2==0)
            {
                iSum1=iSum1+iDigit;
            }
            else
            {
                iSum2=iSum2+iDigit;
            }
            iNo=iNo/10;
        }
        return iSum1-iSum2;
    }
}

class Problem30
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        int iRet=0;
        iRet=tobj.Difference(iValue); 
        System.out.println("Difference  is "+iRet);
    }
}