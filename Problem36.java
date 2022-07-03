//Accept N numbers from user and return frequency of even numbers.

//jay ganesh...

import java.lang.*;
import java.util.*;

class Test
{
    public int Frequency(int arr[])
    {
        int iCnt=0,Counter=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(arr[iCnt]%2==0)
            {
                Counter++;
            }
        }
        return Counter;
    }
}

class Problem36
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
        System.out.println("frequency of even numbers are "+iRet);
    }
}