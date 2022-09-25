// Program 16:To find LCM of Two number using P.F.

import java.util.Scanner;

class LCMbyPF
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
	
	
	int a=2, g=1, LCM, z=1;
	int x=num1, y=num2;
	while(num1>1 && num2>1)	       //1 is not prime Factor
	{
	if(num1%a==0 && num2%a==0)
	  {
        num1= num1/a;
		num2= num2/a;
		z=z*a; 
		g= z;
	  }
     else
	  {
        a++;
      }	
	} 
    LCM= (x*y)/g;
    System.out.print("LCM of "+x+" and "+y+" is : "+LCM);	
}
	
}	