//Write a Java Program to find the Factorial of given number. 

import java.lang.*;
import java.util.*;


class Factorial  
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter a Number");
      
      int no=sobj.nextInt();

      int res=fact(no);
      

      System.out.println(no+"'s"+ "Factorial is "+ res);
        

	} 

	public static int fact(int no)
	{
 
      int sum=0,mul=1;
      for(int i=1;i<=no;i++)
      {

        sum+=sum+i;
 
         mul=mul*i;
          

      }  
        
      return mul;
	}




}
