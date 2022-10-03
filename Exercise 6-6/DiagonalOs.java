public class DiagonalOs {
    public static void main(String[] args) 
    {
        for (int x = 1; x <= 10; x++)
            {
                int j = x;
                while(j>1)
                    {
                        System.out.print(" ");
                        j -= 1;
                    }
                System.out.println("O");
            }
    }
}
