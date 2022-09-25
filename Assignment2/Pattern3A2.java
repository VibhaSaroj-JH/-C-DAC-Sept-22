//Assignment2:Pattern 3 (Star)

class Pattern3A2 
{
  public static void main(String args[])
  {
	  System.out.println("Printing pattern:");
    for (int i=1; i<=5; i++)
	{  
      for (int j=1; j<=i; j++)
	   {
	    System.out.print("* ");
		}
	  	   
	    System.out.println();
	}
   }
}   

/*output to be obtained
   *
   * * 
   * * *
   * * * *
   * * * * *
   
    */