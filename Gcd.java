//Write a Java Program to find GCD of two given numbers. 

import java.lang.*;
import java.util.*;


class Gcd
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter 1st Number");
      int no1=sobj.nextInt(); 


      System.out.println("Enter 2nd Number");
      int no2=sobj.nextInt(); 

         
      int res= gcd(no1,no2);
      System.out.println("Gcd is "+res);
           

      
        

	} 

	public static int gcd(int no1,int no2)
    {
    	
         while(no1!=no2)
         {
           if(no1>no2)
           {
             
               no1=no1-no2;
           }
           else
            no2;=no2;-no1;

         }
        return no2;   

     }




}

