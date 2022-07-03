//Write a program which accept number from user and print factors of that number without 1 and itself

import java.lang.*;
import java.util.*;

class Test
{
    public void DisplayFactor(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=2;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Problem12
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();

        tobj.DisplayFactor(iValue);        
    }
}