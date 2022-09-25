 class Pattern10A2
{
    public static void main(String[] args)
    {
        int alphabet = 65;
        
        for (int i = 4; i >= 0; i--)
        {
			for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= 4; j++)
            {
                System.out.print(" "+(char) (alphabet + j));
            }
            System.out.println();
        }
    }
}