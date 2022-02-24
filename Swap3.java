//swap approch 2
import java.lang.*;
import java.util.*;


class Swap3
{
	
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);

      System.out.println("Enter 1st Number");
      int no1=sobj.nextInt(); 

      System.out.println("Enter 2nd Number");
      int no2=sobj.nextInt();


      

       swap(no1,no2);
      

      
        

	} 

	public static void swap(int no1,int no2)
    {

        no1=no1^no2;
        no2=no1^no2;
        no1=no1^no2;
           
     System.out.println("no1 = "+ no1 +" "+"no2 = "+no2);
 


    }




}
