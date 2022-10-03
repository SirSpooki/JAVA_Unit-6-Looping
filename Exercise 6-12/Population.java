public class Population
{
   public static void main(String[] args)
   {
      double mexicoPop = 128;
      double usPop = 323;
      int year = 0;
      
       while (mexicoPop < usPop) 
       {
            year++;
            mexicoPop *= 1.0101;
            usPop *= 0.9985;
                        System.out.println("Year " + year + ", U.S. population is " + usPop + ", Mexico Population is " + mexicoPop);

       }

      System.out.println("The population of Mexico will exceed the U.S. population in " + year + " years");
      System.out.println("The population of Mexico will be " + mexicoPop + " million");
      System.out.println("and the population of the U.S. will be " + usPop + " million");
   }
}
