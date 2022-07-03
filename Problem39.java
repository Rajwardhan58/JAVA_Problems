//Accept number from user and return frequency of 11 from it

import java.lang.*;
import java.util.*;

class Test
{
    public int Frequency(int arr[])
    {
        int iCnt=0,Counter=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(arr[iCnt]==11)
            {
                Counter++;
            }
        }
        return Counter;
    }
}

class Problem39
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

        Test tobj=new Test();
        iRet=tobj.Frequency(arr);
        System.out.println("frequency of 11 are "+iRet);
    }
}