import java.util.Scanner;

class Sum
{
public static void main (String args[])
{
Scanner SC= new Scanner(System.in);

System.out.println("provide no.1 ");

int Num1 = SC.nextInt();

System.out.println("provide no.2 ");
int Num2 = SC.nextInt();

 int Add= Num1 + Num2;
System.out.println("Sum is  "+Add);
}
}