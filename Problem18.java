//Write a program which accept number from user and Display all its non factors.

import java.lang.*;
import java.util.*;

class Test
{
    public void DisplayNonFactor(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=2;iCnt<=iNo;iCnt++)
        {
            if(iNo%iCnt!=0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Problem18
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();

        tobj.DisplayNonFactor(iValue);        
    }
}