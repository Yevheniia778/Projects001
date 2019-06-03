package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = input.nextInt();
        int nums[] = new int[size];
        System.out.print("Enter array numbers \n");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }
        String l;
        System.out.print("Array: ");
        for (int i = 0; i < size; i++){
            l = "" + nums[i];
            if (nums[i] % 3 == 0) {
                l += "!";
            }
            switch (nums[i]) {
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
            c[i] = nums[i];
        }
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
        System.out.print("\nSorted array: ");
        for (int j = 0; j < c.length; j++) {
            if (j < c.length - 1) {
                System.out.print(c[j] + ",");
            } else {
                System.out.print(c[j] + ".");
            }
        }


    }
}
