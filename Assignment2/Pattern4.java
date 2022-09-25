
class Pattern4
{
  public static void main(String args[])
  {
	
    for (int i=1; i<=5; i++)
	{  
      int c=0;                       //will get sum of col.
	  for (int j=1; j<=i; j++)
	  {
		  c=c+j;
	    System.out.print(j+" ");     //Gives triangle
	  }
	    System.out.print(" "+c);
	    System.out.println();
	}
   }
}   