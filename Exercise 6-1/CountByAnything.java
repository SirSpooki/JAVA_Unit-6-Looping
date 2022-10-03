import java.util.Scanner;
public class CountByAnything
{
   // Modify the code below
   public static void main (String args[])
   {
      final int START;
      final int STOP = 500;
      final int NUMBER_PER_LINE = 20;

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number to count by:");
      START = scan.nextInt();
      for(int i = START; i <= STOP; i += START)
      {
         System.out.print(i + "  ");
         if(i % NUMBER_PER_LINE == 0)
            System.out.println();
      }
   }
}

