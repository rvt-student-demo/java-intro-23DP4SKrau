package lv.rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import java.util.*;

public class App 
{
  public static void main ( String[] args )
  {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> years = new ArrayList<>();
    int sum = 0;
    int count = 0;

    while (true){
      String input = reader.nextLine();
          if (input.equals("")) {
            break;
          }

          String[] parts = input.split(",");
          sum = sum + Integer.valueOf(parts[1]);
          count = count + 1;
    }
    if (count > 0) {
      System.out.println("Average of the birth years:");
      System.out.println("Longest name: ");
    }
  }
}


