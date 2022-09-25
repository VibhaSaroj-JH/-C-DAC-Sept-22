//Assignment2:Pattern 6 (Star)

class Pattern6A2
{
  public static void main(String args[])
  {
	  System.out.println("Printing pattern:");
    for (int i=1; i<=5; i++)
	{  
      for (int j=5; j>=i; j--)
	   {
	    System.out.print("  ");        //by providing 2 spaces insted of 1 we can alingn "* " in right angle triangle.
		}
      for (int j=1; j<=i; j++)
	   {
	    System.out.print("* ");
		}
	  	   
	    System.out.println();
	}
   }
}   

/*
          *
    	* *
	  * * *
    * * * *			 
  * * * * * 
  
 */  