//Program 5: to find number is Positive or Negative.

import java.util.Scanner;

class PositiveNagative
{
public static void main(String args[])
 {
   Scanner EO = new Scanner (System.in);

   System.out.println("Dear User, provide a number");
   int num= EO.nextInt();

   if (num>0)
     {
       System.out.println ("The number "+num+" is positive.");
     }
   else
     { 
       System.out.println ("The number "+num+" is negative.");
     }
   }
}
