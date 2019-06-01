package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first boundary of the matrix: ");
        int a = input.nextInt();
        System.out.print("Enter the second boundary of the matrix:: ");
        int b = input.nextInt();
        int max = a * b;
        String m;
        m = "" + max + 1;
        String f;
        String s;
        for (int i = 1; i <= a; i++) {
            f = "" + i;
            for (int x = f.length(); x < m.length(); x++){
                f += " ";
            }
            System.out.print(f);
            for (int j = 1; j <= b; j++) {
                s = "" + (i * j);
                for (int y = s.length(); y < m.length(); y++) {
                    s += " ";
                }
                System.out.print(s);
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
