package com.step2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A < B) {
            System.out.println("<");
        }
        if (A > B) {
            System.out.println(">");
        }
        if (A == B) {
            System.out.println("==");
        }

    }
}

