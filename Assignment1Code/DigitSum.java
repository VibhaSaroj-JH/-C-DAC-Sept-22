//Program 10: To find sum of digits of given numbers.

import java.util.Scanner;

class DigitSum
{
  public static void main(String args[])
  {
    Scanner Di= new Scanner(System.in);
	
	System.out.println("Hi user, provide a number to print digit of number");
	int num= Di.nextInt();
	System.out.println("The number provided is "+num);
	int i, sum=0;
	while(num>0)
	  {
	   i=num%10;
	   num=num/10;
	   sum= sum+i;
	  }
	   
	  	System.out.print("Sum of digits of given number is = "+sum);
    }
	
}	  
	   