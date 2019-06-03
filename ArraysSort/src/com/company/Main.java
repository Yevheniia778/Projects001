package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int size = input.nextInt();
        int a [] = new int[size];
        int b [] = new int[size];
        System.out.print("Enter numbers for the first array: \n");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = input.nextInt();
        }
        System.out.print("Enter numbers for the second array: \n");
        for (int j = 0; j < size; j++){
            System.out.print("Enter number " + (j + 1) + ": ");
            b[j] = input.nextInt();
        }

        String l;
        System.out.print("First array: ");
        for (int i = 0; i < size; i++){
            l = "" + a[i];
            if (a[i] % 3 == 0) {
             l += "!";
            }
            switch (a[i]) {
                case 2:
                case 7:
                case 8:
                case 15:
                case 34:
                    l += "#";
                break;
            }
            System.out.print(l + " ");
        }
        System.out.print("\nSecond array: ");
        for (int i = 0; i < size; i++){
            l = "" + b[i];
            if (b[i] % 3 == 0) {
                l += "!";
            }
            switch (b[i]) {
                case 2:
                case 7:
                case 8:
                case 15:
                case 34:
                    l += "#";
                    break;
            }
            System.out.print(l + " ");
        }
        int c [] = new int[size];
        for (int i = 0; i < size; i++){
            c[i] = a[i] * b[i];
        }
        System.out.print("\nResult: ");
        for (int j = 0; j < c.length; j++){
            if (j < c.length - 1) {
                System.out.print(c[j] + ",");
            }
            else {
                System.out.print(c[j] + ".");
            }
        }
//        Arrays.sort(c);
        int temp;
        for (int i = 0; i < c.length; i++){
            for (int j = i + 1; j < c.length; j++){
                if (c[i] > c[j]) {
                    temp = c[j];
                    c[j] = c[i];
                    c[i] = temp;
                }
            }
        }
        System.out.print("\nResult sort: ");
        for (int j = 0; j < c.length; j++){
            if (j < c.length - 1) {
                System.out.print(c[j] + ",");
            }
            else {
                System.out.print(c[j] + ".");
            }
        }
    }
}
