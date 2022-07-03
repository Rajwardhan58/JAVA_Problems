//Accept number from user if number is less than 10 then print hello otherwise print Demo

import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int iNo)
    {
       if(iNo<10)
       {
            System.out.println("Hello");
       }
       else
       {
            System.out.println("Demo");
       }
    }
}

class Problem8
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