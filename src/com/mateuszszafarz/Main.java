package com.mateuszszafarz;

import java.util.Scanner;

public class Main {

    private static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x();
        do {
            x = Main.x.nextInt();
            Main.x.nextLine(); // clear input
            switch (x) {
                case 0:
                    break;
                case 1:
                    x();
                    break;
                default:
                    (new X(x)).x(); // print times table
            }
        } while (x != 0);
    }

    private static void x() {
        System.out.println("Menu:");
        System.out.println("\t [0] - Quit program.");
        System.out.println("\t [1] - Print this menu.");
        System.out.println("\t [any number] - Print times table for that number.\n");
    }
}
