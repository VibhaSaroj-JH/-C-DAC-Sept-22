//Program 1: to find number is even or odd.

import java.util.Scanner;

class EvenOdd
{
public static void main(String args[])
 {
   Scanner EO = new Scanner (System.in);

   System.out.println("Dear User, provide a number");
   int num= EO.nextInt();

   if (num%2==0)
     {
       System.out.println ("The number "+num+" is even.");
     }
   else
     { 
       System.out.println ("The number"+num+" is odd.");
     }
   }
}
