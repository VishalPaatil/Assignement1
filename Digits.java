//Write a Java Program to print the digits of a Given Number. 

import java.lang.*;
import java.util.*;


class Digits
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter Number");
      int no=sobj.nextInt(); 



      

        int res=count(no);
        System.out.println("Total Digits Are : "+res);

      
        

	} 

	public static int count(int no)
    {

       int cnt=0;

       while(no!=0)
       {
           no=no/10;
           cnt++;

       }

      return cnt;


     }




}
