package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        double score = Double.valueOf(scanner.nextLine());
        if (score > 100) {
            System.out.println("Grade: incredible!");  
        } else if (score < 100 && score > 90) {
            System.out.println("Grade: 5");
        }else if (score < 89 && score > 80) {
            System.out.println("Grade: 4");
        }else if (score < 79 && score > 70) {
            System.out.println("Grade: 3");
        }else if (score < 69 && score > 60) {
            System.out.println("Grade: 2");
        }else if (score < 59 && score > 50) {
            System.out.println("Grade: 1");
        }else if (score < 49 && score > 0) {
            System.out.println("Grade: failed");
        } else {
            System.out.println("Grade: Impossible!");  
        }
    }
}