//Program to check number is armstrong  or not.

import java.util.Scanner;

class Armstrong
{
public static void main(String args[])
{
Scanner AS= new Scanner(System.in);

System.out.println("Dear user, find the number is armstrong number or not.");

System.out.println("Provide the number");
int num= AS.nextInt();
System.out.println("The number is "+num);

int rem, Arm=0, con= num; 

while(num>0)
     { 
		 rem= num%10;                          //finding remainder of number 
		 Arm= (rem*rem*rem)+Arm; 
		 num= num/10;                          
	 }

if (con==Arm)
     {
	     System.out.println(con+" is armstrong"); 
     }	
else
     {
	     System.out.println(con+" is not armstrong");
     }
	 
}
}