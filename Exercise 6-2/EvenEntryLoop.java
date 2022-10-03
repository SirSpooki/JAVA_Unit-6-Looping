import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) 
    {   
        int userNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write even number>>");
        userNum = scan.nextInt();

        while(userNum != 999)
            {
                if(userNum%2 == 0)
                    {
                        System.out.println("Good job!");
                    }
                else
                    {
                        System.out.println(userNum+" is not an even number");
                    }
                System.out.println("Write another even number>>");
                userNum = scan.nextInt();
            }

    }
}


