//Assignment2:Pattern 2 (Alphabet)

public class Pattern2A2
{
    public static void main(String[] args)
    {
		System.out.println("Printing pattern:");
        int alphabet = 65;
        
        for (int i = 0; i <= 4; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}

/*output to be obtained
   A
   A B
   A B C
   A B C D
   A B C D E*/