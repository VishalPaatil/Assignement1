//Write a Java Program to print all the Factors of the Given number. 

import java.lang.*;
import java.util.*;


class Factors
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter Number");
      int no=sobj.nextInt(); 

     


      

       fact(no);
      

      
        

	} 

	public static void fact(int no)
    {

      for(int i=1;i<=no;i++)
      {
         if((no%i)==0)
         {
         	System.out.println(i);
         }  

      }    

    
    }




}
