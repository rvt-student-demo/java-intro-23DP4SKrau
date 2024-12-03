package lv.rvt;
// Programma:
        // Paluugt lietotaju ievadit massiva garumu
        // Ar ciklu papildinat doto masivu ar lietotaja ievaditiem datiem

import java.util.Scanner;

// element count: 5
        // Please input element nr 1: 256
        // Please input element nr 2: -233

        // Saskaitam masiva elementu summu un elementu videjo vertibu

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element count: ");
        int elementCount = scanner.nextInt();
        int[] elements = new int[elementCount];

        for (int i = 0; i < elementCount; i++) {
            System.out.println("Please input element nr." + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
          
        }
        
    }

  }          
