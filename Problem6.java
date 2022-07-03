//Accept number from user and print that number of star on screen by usin for loop

import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int iNo)
    {
        for(int iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print("*     ");
        }
    }
}

class Problem6
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