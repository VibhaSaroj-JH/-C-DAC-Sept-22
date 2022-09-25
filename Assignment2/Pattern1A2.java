//Assignment2:Pattern 1 (number)

class Pattern1A2
{
  public static void main(String args[])
  {
	  System.out.println("Printing pattern:");
	  
    for (int i=1; i<=5; i++)
	{  
      for (int j=1; j<=i; j++)
	   {
	    System.out.print(j+" ");
		}
	  	   
	    System.out.println();
	}
   }
}   

/*output to be obtained
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5 */