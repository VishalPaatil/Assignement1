//Write a Java Program to find whether given number is Leap year or NOT? 

import java.lang.*;
import java.util.*;


class  LeapYear  
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter a Year");
      
      int no=sobj.nextInt();

            if((no%4)==0)
      {
              System.out.println("It is a Leap Year");


      }else 
      
     System.out.println("It is Not a Leap Year");
     
        

	} 






}
