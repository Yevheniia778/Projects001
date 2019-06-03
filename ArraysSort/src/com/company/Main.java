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
        System.out.print("Enter numbers for the first array: ");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("Enter numbers for the second array: ");
        for (int j = 0; j < size; j++){
            b[j] = input.nextInt();
        }
        int c [] = new int[size];
        for (int i = 0; i < size; i++){
            c[i] = a[i] * b[i];
        }
        System.out.print("Result: ");
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
        System.out.print("Result sort: ");
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
