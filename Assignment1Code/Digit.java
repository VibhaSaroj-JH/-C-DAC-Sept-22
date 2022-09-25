//To find digits of given numbers.

import java.util.Scanner;

class Digit
{
  public static void main(String args[])
  {
    Scanner Di= new Scanner(System.in);
	
	System.out.println("Hi user, provide a number to print digit of number");
	int num= Di.nextInt();
	System.out.println("The number provided is"+num);
	int i;
	while(num>0)
	  {
	   i=num%10;
	   System.out.print(i+" ");
	   num=num/10;
	  }
	  
    }
	
}	  
	   