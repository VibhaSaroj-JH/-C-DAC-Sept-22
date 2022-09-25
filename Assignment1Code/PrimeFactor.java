//Program 18: To find all prime factors of a number.

import java.util.Scanner;

class PrimeFactor
{
  public static void main(String args[])
  {
    Scanner PF= new Scanner(System.in);
	
	System.out.println("Hi user, provide a number to print Prime Factors.");
	int num= PF.nextInt();
	System.out.println("The number provided is"+num);
	System.out.println("The Prime factors of "+num+" are ");
	
	int a=2;
	while(num>1)	       //1 is not prime Factor
	{
	if(num%a==0)
	  {
	    System.out.println(a+" ");
        num= num/a;
	  }
     else
	  {
        a++;
      }	
	  
	}
    	
}
	
}	