//Accept number from user and display such elements which are even and divisible by 5 
import java.lang.*;
import java.util.*;

class Test
{
    public void Display(int arr[])
    {
        int iCnt=0;
        System.out.println("Numbers are even and divisible by 5 are :");
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            if((arr[iCnt]%5==0)&&(arr[iCnt]%2==0))
            {
                System.out.println(arr[iCnt]);
            }
        }
    }
}

class Problem33
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int iSize=sobj.nextInt();

        int iCnt=0;
        int arr[]=new int[iSize];

        System.out.println("Enter the elemnts in array");

        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            arr[iCnt]=sobj.nextInt();
        }

        Test tobj=new Test();
        tobj.Display(arr);
    }
}