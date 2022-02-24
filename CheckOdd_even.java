import java.lang.*;
import java.util.*;


class CheckOdd_even  
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter a Number");
      
      int no=sobj.nextInt();

      boolean result = Check(no);
      
      if(result==true)
      {

       System.out.println("Number is Even");    
       
       }
        else 
        System.out.println("Number is Odd");    
          
        

	} 


    public static boolean Check(int no)
      {
         if((no%2)==0)
         {
         	return true;
         }
         else
         {
         	return false;
         } 


      }   



}