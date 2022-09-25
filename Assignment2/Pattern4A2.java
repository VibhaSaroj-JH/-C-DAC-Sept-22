//Assignment2:Pattern 4 (number)

class Pattern4A2
{
  public static void main(String args[])
  {
	  System.out.println("Printing pattern:");
    for (int i=1; i<=5; i++)
	{  
      for (int j=1; j<=i; j++)
	   {
	    System.out.print(i+" ");
		}
	  	   
	    System.out.println();
	}
   }
}   

/*output to be obtained
   1
   2 2
   3 3 3
   4 4 4 4
   5 5 5 5 5
   */