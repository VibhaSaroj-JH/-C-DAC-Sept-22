//Program 13: to print reverse of given number.

import java.util.Scanner;

class Reverse
{
public static void main(String args[])
{

   Scanner R= new Scanner(System.in);
   System.out.println("Dear user, Enter an number to print its reverse.");
   int num= R.nextInt();
   System.out.println("The number provided is = "+num);
   int rem, rev= 0;

   while(num>0)
     {
	   rem= num%10;
	   rev= rev*10 + rem;
	   num= num/10;
	 }
    
    System.out.println("The reverse number is = "+rev);
}

}	
	   
	   