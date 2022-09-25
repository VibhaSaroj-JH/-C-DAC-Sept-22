//Program to print odd number series  of number provided by user.

import java.util.Scanner;

class OddSeries
{
public static void main(String args[])
{
  Scanner ES= new Scanner(System.in);
  System.out.println("Enter an number upto which ODD number series to be printed.");
  int num= ES.nextInt();
  
  System.out.println("Printing ODD number series up to "+num);  
  
  for (int i=1;i<=num;i++)
   {
    if(i%2!=0)
	{
      System.out.print(i+" ");
	}
	  else
	  continue;
   }
   
}
}   