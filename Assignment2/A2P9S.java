 

//Assignment2:Pattern 9 (Star)

class A2P9S
{
  public static void main(String args[])
  {
    for (int i=1; i<=4; i++)
	{  
      for (int j=5; j>=i; j--)
	   {
	    System.out.print(" ");
		}
		
      for (int j=1; j<=i; j++)
	   {
	    System.out.print("*");
		}
		   
	    System.out.println();
	}
	for (int i=1; i<=5; i++)
	{  
	  for (int j=1; j<=i; j++)
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

