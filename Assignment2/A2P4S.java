//Assignment2:Pattern 4 (Star)

class A2P4S
{
  public static void main(String args[])
  {
    for (int i=1; i<=5; i++)
	{  
      for (int j=1; j<=i; j++)               // for o/p:
      {                                      // *****
	    System.out.print(" ");               //  ****
		}                                    //   ***
		                                     //    **
      for (int j=5; j>=i; j--)               //     *
	   {
	    System.out.print("*");
		}
		
	  	   
	    System.out.println();
	}
   }
}                                          
                                             
                                            
