//How to add two numbers without using the arithmetic operators in Java? 

import java.lang.*;
import java.util.*;


class AddNumber
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter 1st Number");
      int no1=sobj.nextInt(); 

      System.out.println("Enter 2nd Number");
      int no2=sobj.nextInt(); 
     

      int res= sum(no1,no2);
      System.out.println("Addition is "+res);
           

      
        

	} 

	public static int sum(int no1,int no2)
    {

       while(no2!=0)
       {
          no1++;
          no2--;
       }

      return no1;
    }




}

