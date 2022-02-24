//Write a Java Program to find sum of the digits of a given number. 

import java.lang.*;
import java.util.*;


class SumDigits
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter Number");
      int no=sobj.nextInt(); 

     


      

      int res= sum(no);
      System.out.println("Sum of digits of Number "+no+" is "+res);
           

      
        

	} 

	public static int sum(int no)
    {

     int sum=0,idigit=0; 
     while(no!=0)
     {
        idigit=no%10;
        sum+=idigit; 
     	no=no/10;

     }

     return sum;     
    }




}

