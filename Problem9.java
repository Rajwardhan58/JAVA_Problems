//Accept two numbers from user and display first number in second number of times

import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int iNo1,int iNo2)
    {
        for(int iCnt=1;iCnt<=iNo2;iCnt++)
        {
            System.out.println(iNo1);
        }
    }
}

class Problem9
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter first number");
        int iValue1=sobj.nextInt();

        System.out.println("Enter second number");
        int iValue2=sobj.nextInt();

        Test tobj=new Test();
        tobj.Display(iValue1,iValue2);
    }
}