//Write a program which accept number from user and return Multiplication of all digit

import java.lang.*;
import java.util.*;

class Test
{
    public int Mult(int iNo)
    {
        int iDigit=0;
        int iMult=1;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            iMult=iMult*iDigit;
            iNo=iNo/10;
        }
        return iMult;
    }
}

class Problem29
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        int iRet=0;
        iRet=tobj.Mult(iValue); 
        System.out.println("Multiplication  is "+iRet);
    }
}