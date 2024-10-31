package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number less than 100: ");
        int userInput = scanner.nextInt();

        for (int number = userInput; number <= 100; number ++) {
            System.out.println(number);
        }
        scanner.close();
   }
}