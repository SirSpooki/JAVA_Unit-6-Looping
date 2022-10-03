public class Factorials
{
   public static void main (String args[])
   {
      int start;
      int end = 10;
      int result = 1;

      for(start = 1; start <= end; start++)
        {
            for(int factorialValue = start; factorialValue > 0; factorialValue--)
                {
                    result = result*factorialValue;
                }
            System.out.println("The factorial of "+start+" is "+result);
            result = 1;
        }
   }
}
