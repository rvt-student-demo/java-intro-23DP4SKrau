package lv.rvt;

import java.util.*;

public class App 
{
    public static void print (String s, int count) {
        for (int i = 0; i < count; i++) System.out.print(s);
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            print(" ", height - i - 1);
            print("*", 2 * i + 1);
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            print(" ", height - 2);
            print("*", 3);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        christmasTree(4);
    }
}