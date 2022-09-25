//Assignment2:Pattern 3 (Star)- 2nd page

class A2P33S
{
  public static void main(String args[])
  {
    for (int i=1; i<=5; i++)
	{  
      for (int j=1; j>=1; j--)
	   {
	    System.out.print(" ");
		}
      for (int j=5; j>=i; j--)
	   {
	    System.out.print("*");
		}
		
	  	   
	    System.out.println();
	}
   }
}   