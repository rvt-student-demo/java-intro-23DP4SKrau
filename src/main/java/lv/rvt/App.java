package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number: ");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("OK");
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
   }
}
