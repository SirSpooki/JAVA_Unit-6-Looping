import java.util.Scanner;
public class Inbetween {
    public static void main (String args[]) 
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an integer>>");
        int num1 = scan.nextInt();
        System.out.println("Enter an integer>>");
        int num2 = scan.nextInt();

        System.out.println("The numbers between "+num1+" and "+num2+" include:");
        int t = 0;

        if(num1 > num2)
            {
                for(t = (num1-1); t > num2; --t)
                    {
                        System.out.print("  "+t);
                    }
            }
        if (num1 < num2)
            {
                for(t = (num1+1); t < num2; ++t)
                    {
                        System.out.print("  "+t);
                    }
            }
        if ((num1 -1 ) == num2 || (num1 +1 ) == num2 || (num2 -1 ) == num1 || (num2 +1 ) == num1)
            {
                System.out.print("There are no integers between "+num1+" and "+num2);
            }
    }
}


