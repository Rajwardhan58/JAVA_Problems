//Accept number from user and print that number of star on screen by using while loop

import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int iNo)
    {
        while(iNo>0)
        {
            System.out.print("*     ");
            iNo--;
        }
    }
}

class Problem7
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