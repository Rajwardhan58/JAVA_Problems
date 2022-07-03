//Program to print n to 1 numbers on screen

import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int iNo)
    {
        for(int iCnt=iNo;iCnt>=1;iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class Problem3
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        tobj.Display(iValue);
    }
}