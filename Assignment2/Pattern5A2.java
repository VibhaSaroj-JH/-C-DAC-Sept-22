//Assignment2:Pattern 5 (Alphabet)

public class Pattern5A2
{
    public static void main(String[] args)
    {
		System.out.println("Printing pattern:");
        int alphabet = 65;
        
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}

/*output to be obtained
   A
   B B
   C C C
   D D D D
   E E E E E*/