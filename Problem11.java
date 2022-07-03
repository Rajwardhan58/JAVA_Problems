//Write a program which accept one number from user and print that number of even numbers on screen

import java.lang.*;
import java.util.*;

class Test
{
    public void DisplayEvenF(int iNo)
    {
        int i=0;
        int iCnt=0;
       for(iCnt=1;iCnt<=iNo;iCnt++)
       {
            i=i+2;
            System.out.println(i);
       }
    }

    public void DisplayEvenW(int iNo)
    {
        int i=0;
        while(iNo>=1)
        {
            i=i+2;
            System.out.println(i);
            iNo--;
        }
    }
}

class Problem11
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();

        tobj.DisplayEvenF(iValue);
        tobj.DisplayEvenW(iValue);
        
    }
}