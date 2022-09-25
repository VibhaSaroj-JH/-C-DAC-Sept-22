//Program to check number is palindrome  or not.

import java.util.Scanner;

class Palindrome
{
public static void main(String args[])
{
Scanner P= new Scanner(System.in);

System.out.println("Dear user, find the number is palindrome number or not.");

System.out.println("Provide the number");
int num= P.nextInt();
System.out.println("The number is "+num);

int rem, Rnum=0, comp= num; 

 while(num>0)
     { 
		 rem= num%10;                          //finding remainder of number 
		 Rnum= Rnum*10 + rem;                  //f,e: 1221 any number with unit digit 10 can add nu. 0-9
		 num= num/10;                          // at unit place to make it new unit digit.         
	 }                                     	 // Here,we are making unit digit 0 by *10 so that we can get reverse order. 

     System.out.println("Reversed number is = "+Rnum);

    if (comp==Rnum)
      {
	     System.out.println(comp+" is palindrome"); 
      }	
    else
      {
	     System.out.println(comp+" is not palindrome");
      }
	 
}
}