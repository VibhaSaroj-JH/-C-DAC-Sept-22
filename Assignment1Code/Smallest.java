import java.util.Scanner;

class Smallest
{
public static void main (String args[])
  {
	Scanner N = new Scanner (System.in);
	System.out.println("Dear user, provide value of a, b, c");
	int a= N.nextInt ();
	int b= N.nextInt ();
	int c= N.nextInt ();
	System.out.println("Value of a = "+a);
	System.out.println("Value of b = "+b);
	System.out.println("Value of c = "+c);
	
	if (a<b)
	   {
	    if(a<c)
		 {
		  System.out.println("Value of a: "+a+" is smallest.");
		 }
        else
         {
          System.out.println("Value of c: "+c+" is smallest.");	
         }
       }
	   
    else
       {
	    if(b<c)
		 {
		  System.out.println("Value of b: "+b+" is smallest.");
		 }
        else
         {
          System.out.println("Value of c: "+c+" is smallest.");	
         }
        }
   }
 
 }	   
		