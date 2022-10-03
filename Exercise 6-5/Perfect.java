public class Perfect {
    public static void main (String args[]) {
        // Write your code here
   
        int sum = 0;
        for(int num=1; num < 1000; num++)
            {
                sum = 0;
                for(int i = 1; i <= num/2; i++)
                    {
                        if(num % i == 0)
                            {
                                sum += i;
                            }
                    }
                if(sum == num)
                    {
                        System.out.println(num+"  ");
                    }
            }
    }
}


