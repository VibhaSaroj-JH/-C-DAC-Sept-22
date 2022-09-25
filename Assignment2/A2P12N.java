//Assignment2:Pattern 12 (Number)

class A2P12N
{
  public static void main(String args[])
  {
    for (int i=1; i<=5; i++)
	{  
      for (int j=5; j>=i; j--)
	   {
	    System.out.print(" ");        
		}
      for (int j=i; j<=i; j++)
	   {
	    System.out.print(" "+i);
		}
	  	   
	    System.out.println();
	}
   }
}   