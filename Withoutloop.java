


import java.lang.*;
import java.util.*;


class Withoutloop
{
  
  public static void main(String arg[])
   { 
        fun(1); 
 
   } 



public static void fun(int n){
       if(n <= 10) 
       {
         System.out.println(n); 
         fun(n+1);        
 
        }
    }


}



