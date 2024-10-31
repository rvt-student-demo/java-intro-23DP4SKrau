package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
int number = Integer.valueOf(reader.nextLine());

  if (number % 4 != 0) {
    System.out.println("The year is not a leap year.");
} if (number % 5 == 0) {
    System.out.println("The number is divisible by five!");
} if (number % 6 != 0) {
    System.out.println("The number is not divisible by six!");
}
   }
}