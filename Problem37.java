//Accept N numbers from user and return difference between frequency of even numbers odd numbers.

import java.lang.*;
import java.util.*;

class Test
{
    public int Frequency(int arr[])
    {
        int iCnt=0,Counter1=0,Counter2=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(arr[iCnt]%2==0)
            {
                Counter1++;
            }
            else
            {
                Counter2++;
            }
        }
        return Counter1-Counter2;
    }
}

class Problem37
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of arry");
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
        System.out.println("Difference between frequency of even numbers odd numbers "+iRet);
    }
}