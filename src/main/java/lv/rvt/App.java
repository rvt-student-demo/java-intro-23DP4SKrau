package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter numbers: ");
    
            while (true) {
                int number = scanner.nextInt();
    
                if (number == -1) {
                    System.out.println("OK");
                    break;
                }
            }
            scanner.close();
       }
    
    }   
}
