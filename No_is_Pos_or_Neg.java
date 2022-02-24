//How to check the given number is Positive or Negative in Java? 



import java.lang.*;
import java.util.*;


class No_is_Pos_or_Neg
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter 1st Number");
      int no1=sobj.nextInt(); 

       if(no1>0)
       {
         System.out.println("Number is positive");

       } 
       else if(no1==0)
       {
         System.out.println("Number is Zero");
       }
       else
        System.out.println("Number is Negative");
       
       
        

	} 




}
