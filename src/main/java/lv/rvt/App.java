package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int times = scanner.nextInt();

        int count = 0;
        while (count < times) {
            printText();
            count++;
        }

        scanner.close();
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
