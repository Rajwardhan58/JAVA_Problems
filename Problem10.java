//Accept the number from user and check whether the number is even or not

import java.lang.*;
import java.util.*;

class Test
{
    public boolean ChkEvenOdd(int iNo)
    {
        if(iNo%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Problem10
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");
        int iValue=sobj.nextInt();
        boolean bRet=false;
        Test tobj=new Test();
        bRet=tobj.ChkEvenOdd(iValue);

        if(bRet==true)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}