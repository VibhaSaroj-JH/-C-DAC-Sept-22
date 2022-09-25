import java.util.Scanner;
class ANatural
{
public static void main (String args[])
{
	Scanner N= new Scanner (System.in);
	System.out.println("Dear user, provide an natural number");
	int num= N.nextInt();
    int i=1, sum=0;
        while (i<=num)
        {
          sum= sum+i;
          i++;
        }
 System.out.println("Sum of natural number till "+num+" is "+sum);
}
}