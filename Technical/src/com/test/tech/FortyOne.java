package com.test.tech;

public class FortyOne {
public static void main(String[] args) {
      for (int i = 5; i >= 1; i--) {
           for (int j = i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= 4; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
