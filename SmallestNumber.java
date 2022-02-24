//Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 

import java.lang.*;
import java.util.*;


class SmallestNumber
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter 1st Number");
      int no1=sobj.nextInt(); 

      System.out.println("Enter 2nd Number");
      int no2=sobj.nextInt(); 
     
      System.out.println("Enter 2nd Number");
      int no3=sobj.nextInt(); 
     


      

      int res= sum(no1,no2,no3);
      System.out.println("Smallest number is "+res);
           

      
        

	} 

	public static int sum(int no1,int no2,int no3)
    {

       int cnt=0;

      while(no1!=0 && no2!=0 && no3!=0)
      {

          no1--;
          no2--;
          no3--;
          cnt++;

      }
      return cnt;

    }




}

