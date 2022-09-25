// Program 15:To find LCM of Two number.

import java.util.Scanner;

class LCM
{
  public static void main(String args[])
  {
    Scanner PF= new Scanner(System.in);
	
	System.out.println("Hi user, provide a number to print LCM.");
	int num1= PF.nextInt();
	System.out.println("The first number provided is = "+num1);
	int num2= PF.nextInt();
	System.out.println("The second number provided is = "+num2);
	System.out.println("The factors of "+num1+" and "+num2+" are :");
	
	int g= 1, LCM;
	
	for(int i=1; i<= num1 ;i++)
	{
	 if(num1%i==0 && num2%i==0)
	  {
		g = i;
	  }
       
	}
	
    LCM= (num1*num2)/g;
    System.out.print("LCM of "+num1+" and "+num2+" is : "+LCM);	
}
	
}	