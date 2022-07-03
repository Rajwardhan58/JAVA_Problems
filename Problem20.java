// Write aprogram which accept number from user and return difference between summation of its factor and non factor

import java.lang.*;
import java.util.*;

class Test
{
    public int Difference(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        int iSum1=0;
        int iSum2=0;
        for(int iCnt1=1;iCnt1<=iNo;iCnt1++)
        {
            if(iNo%iCnt1==0)
            {
                iSum1=iSum1+iCnt1;
            }
            else
            {
                iSum2=iSum2+iCnt1;
            }
        }
        return iSum1-iSum2;
    }
}

class Problem20
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        int iRet=0;
        iRet=tobj.Difference(iValue);        
        System.out.println("Difference is "+iRet);
    }
}

