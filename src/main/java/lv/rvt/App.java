package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            long factorial = 1;
    
            if (number < 0) {
                System.out.println("Factorial is not defined.");
            } else {
                for (int i = 1; i <= number; i++) {
                    factorial *= i; 
                }
                System.out.println("Factorial is: " + factorial);
            }
            scanner.close();
       }
    }   
}
