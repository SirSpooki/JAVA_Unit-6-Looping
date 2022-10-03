public class CountByFives {
    public static void main (String args[]) 
    {
        int y = 0;
        for(int x = 0; x < 100; ++x)
            {
                y += 5;
                System.out.println(y);
                if (y%50 == 0)
                    {
                        System.out.println();
                    }
            }
    }
}
