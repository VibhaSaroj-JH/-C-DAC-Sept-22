import java.util.Scanner;

class Prime
{
public static void main(String args[])
{

Scanner S= new Scanner(System.in);
System.out.println("Dear user, Enter an number to check it's prime or not");
int num= S.nextInt();
int count= 0;

if (num>1)
   {
	   
    for(int i=1;i<=num;i++)
	{
	if(num%i==0)
	   count++;
	}
   
	
	if (count==2)
	{
	 System.out.println(" The number is prime number.");
	}
	else
	{
	System.out.println(" The number is not prime number.");
	}
	
   }
else
   {
   System.out.println (" The Number is not prime number");
   }
}
}   


