// Program 2: to find factorial of given number.

import java.util.Scanner;

class Factorial
{
  public static void main(String args[])
  {
    Scanner Fac= new Scanner(System.in);
	System.out.println("Hello User, please provide number whose factorial is required");
    int num= Fac.nextInt();
    
    System.out.println("The number provided is "+num);
	int mul=1;
	
	for(int i=1; i<=num; i++)
	   {
	    mul= mul*i;
	   }
	   System.out.println("Factorial of "+num+" is "+mul);
	   
   }
}   