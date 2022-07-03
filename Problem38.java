//Accept number from user and check whether that number contains 11 in it or not.

import java.lang.*;
import java.util.*;

class Test
{
    public boolean ChkNo(int arr[])
    {
        int iCnt=0;
        boolean bFlag=false;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(arr[iCnt]==11)
            {
                bFlag=true;
                break;
            }
        }
        return bFlag;
    }
}

class Problem38
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of arry");
        int iSize=sobj.nextInt();

        int arr[]=new int[iSize];
        int iCnt=0;
        boolean bRet=false;
        System.out.println("Enter the elemnets ");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }

        Test tobj=new Test();
        bRet=tobj.ChkNo(arr);
        
        if(bRet==true)
        {
            System.out.println("11 number is contains in array");
        }
        else
        {
            System.out.println("11 number is not contains in array");
        }
    }
}