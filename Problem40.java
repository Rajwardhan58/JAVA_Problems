//Accept number from user and accept one another number as Number,return frequency of Number form it.

import java.lang.*;
import java.util.*;

class Test
{
    public int Frequency(int arr[],int iNo)
    {
        int iCnt=0,Counter=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(arr[iCnt]==iNo)
            {
                Counter++;
            }
        }
        return Counter;
    }
}

class Problem40
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
        int iCnt=0,iRet=0;
        System.out.println("Enter the elemnets ");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }
        System.out.println("Enter the element that you want to find");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        iRet=tobj.Frequency(arr,iValue);
        System.out.println("frequency of "+iValue+" number are "+iRet);
    }
}
