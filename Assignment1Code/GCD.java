// Program 14:To find GCD of a number.

import java.util.Scanner;

class GCD
{
  public static void main(String args[])
  {
    Scanner PF= new Scanner(System.in);
	
	System.out.println("Hi user, provide a number to print GCD (HCF).");
	int num1= PF.nextInt();
	System.out.println("The first number provided is = "+num1);
	int num2= PF.nextInt();
	System.out.println("The second number provided is = "+num2);
	System.out.println("The factors of "+num1+" and "+num2+" are :");
	
	int g= 1;
	
	for(int i=1; i<= num1 ;i++)
	{
	 if(num1%i==0 && num2%i==0)
	  {
		g = i;
	  }
       
	}
    System.out.print("GCD of "+num1+" and "+num2+" is : "+g);	
}
	
}	