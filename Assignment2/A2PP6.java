 

//Assignment2:Pyramid pattern-6

class A2PP6
{
  public static void main(String args[])
  {
	for (int i=1; i<=9; i++)
	{  
      for (int j=1; j<=i; j++)
	   {
	    System.out.print(" ");
		}
		for (int j=9; j>=i; j--)
	   {
	    System.out.print("* ");
		}
		   
	    System.out.println();
	}
   }
}   

