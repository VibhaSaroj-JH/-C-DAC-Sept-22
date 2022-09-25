
class Pattern5
{
  public static void main(String args[])
  {
	int c=0;
    for (int i=1; i<=5; i++)
	{                     
	  for (int j=1; j<=i; j++)
	  {
		  //c=c++;                     //Post increment so o/p will be 0  
          c=++c;                       // we can also use only "++c"		  
		  System.out.print(" "+c);
		  //c++;                       //is also correct
	  }
	   
	    System.out.println();
	}
   }
}   