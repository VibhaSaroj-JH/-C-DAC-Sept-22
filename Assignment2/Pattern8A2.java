////Assignment2:Pattern 8 (Number)

class Pattern8A2
{
  public static void main(String args[])
  {
	  System.out.println("Printing pattern:");
    for (int i=5; i>=1; i--)
	{  
      for (int j=1; j<i; j++)
	  {		  
		  System.out.print(" ");  
	  }
	  
	  for (int j=i; j<=5; j++)
	  {		  
		  System.out.print(j+" ");  
	  }
	   
	    System.out.println();
	}
   }
}   

/*
Output:
     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
 */