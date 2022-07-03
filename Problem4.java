//Accept one number and check whether the number is divisible by five or not

import java.lang.*;
import java.util.*;

class Test
{
    public boolean ChkDivisible(int iNo)
    {
        if(iNo%5==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Problem4
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");
        int iValue=sobj.nextInt();
        boolean bRet=false;
        Test tobj=new Test();
        bRet=tobj.ChkDivisible(iValue);

        if(bRet==true)
        {
            System.out.println("Number is divisible by five");
        }
        else
        {
            System.out.println("Number is not divisible by five");
        }
    }
}