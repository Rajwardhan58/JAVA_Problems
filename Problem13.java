//Write a program which accept number from user and print even factors of that number

import java.lang.*;
import java.util.*;

class Test
{
    public void DisplayEvenFactor(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        for(int iCnt=2;iCnt<=(iNo/2);iCnt++)
        {
            if((iNo%iCnt==0) && (iCnt%2==0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Problem13
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();

        tobj.DisplayEvenFactor(iValue);        
    }
}