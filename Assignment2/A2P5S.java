 

//Assignment2:Pyramid pattern 11 star

class A2P5S
{
  public static void main(String args[])
  {
	
	for (int i=1; i<=5; i++)
	{  
      for (int j=4; j>=i; j--)
	   {
	    System.out.print(" ");
		}
		for (int j=1; j<=i; j++)
	   {
	    System.out.print("*");
		}
		   
		for (int j=0; j<i-1; j++)
	   {
	    System.out.print("*");
		 
		}
		   
	    System.out.println();
	
	}
   }
}   

