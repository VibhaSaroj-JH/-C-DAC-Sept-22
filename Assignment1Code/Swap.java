//Program 4: SWAP two number without using third number.

import java.util.Scanner;

class Swap
{
public static void main (String args[])
{
  Scanner S= new Scanner(System.in);

  System.out.println("Provide First Number ");
  int Num1 = S.nextInt();
  System.out.println("First number is "+Num1);

  System.out.println("Provide Second Number ");
  int Num2 = S.nextInt();
  System.out.println("Second number is "+Num2);

    Num1= Num1+ Num2;
    Num2= Num1- Num2;
    Num1= Num1- Num2;

  System.out.println("After swapping we will get, first number as "+Num1+" second number as "+Num2);
 

}
}