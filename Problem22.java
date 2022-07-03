//Write a program which accept number from user and check whether it contains 0 in it or not
import java.lang.*;
import java.util.*;

class Test
{
    public boolean Reverse(int iNo)
    {
        int iDigit=0;
        boolean bFlag=false;        
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iDigit==0)
            {
                bFlag=true;
                break;
            }
            iNo=iNo/10;
        }
        return bFlag;
    }
}

class Problem22
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the value");
        int iValue=sobj.nextInt();

        Test tobj=new Test();
        boolean bRet=false;
        bRet=tobj.Reverse(iValue); 

        if(bRet==true)
        {
            System.out.print("Number contains 0");
        }       
        else
        {
            System.out.print("Number does not contains 0");
        }
    }
}