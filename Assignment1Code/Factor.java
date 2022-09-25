// Program 9:To find factors of a number.

import java.util.Scanner;

class Factor
{
  public static void main(String args[])
  {
    Scanner PF= new Scanner(System.in);
	
	System.out.println("Hi user, provide a number to print Factors.");
	int num= PF.nextInt();
	System.out.println("The number provided is"+num);
	System.out.println("The factors of "+num+" are ");
	
	for(int i=1; i<=num;i++)
	{
	 if(num%i==0)
	  {
	    System.out.print(i+" , ");
	  }
     	
	  
	}
    	
}
	
}	