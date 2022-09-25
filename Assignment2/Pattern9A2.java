////Assignment2:Pattern 9 (Alphabet)

public class Pattern9A2
{
    public static void main(String[] args)
    {
        int alphabet = 65;
        
        for (int i = 0; i <= 4; i++)
        {
			for (int j = 4; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" "+(char) (alphabet + j));
            }
            System.out.println();
        }
    }
}

/*
    A
   A B
  A B C
 A B C D
A B C D E*/ 