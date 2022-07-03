//Accept N numbers from user and return difference between summation of even elements and summetion of odd elements

import java.lang.*;
import java.util.*;

class Test
{
    public int Difference(int arr[])
    {
        int iCnt=0,iSum1=0,iSum2=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(arr[iCnt]%2==0)
            {
                iSum1=iSum1+arr[iCnt];
            }
            else
            {
                iSum2=iSum2+arr[iCnt];
            }
        }
        return iSum1-iSum2;
    }
}

class Problem31
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int iSize=sobj.nextInt();

        int iCnt=0,iRet=0;
        int arr[]=new int[iSize];

        System.out.println("Enter the elemnts in array");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }

        Test tobj=new Test();
        iRet=tobj.Difference(arr);
        System.out.println("Difference between summation of even elements and summetion of odd elements are");
        System.out.println(iRet);
    }
}