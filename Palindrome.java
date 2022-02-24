//Check whether the Given Number is a Palindrome or NOT. 

import java.lang.*;
import java.util.*;


class Palindrome
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter  Number");
      int no1=sobj.nextInt();  

      boolean res=pali(no1); 
     
     if(res==true)
     {
       System.out.println("Number is Palindrome");
     }
     else
     {

      System.out.println("Number is Not Palindrome");       
 
     }

}


public static boolean pali(int no)
{
    int iDigit=0,sum=0;
    int temp=no; 

    while(no!=0)
    {
      iDigit=no%10;
      sum=sum*10+iDigit;
      no=no/10;
    }

    if(temp==sum)
    {
    	return true;
    }
    else
    {
    	return false;
    }



}  
}