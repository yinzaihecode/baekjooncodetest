package com.step3;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int a, b;
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + (a + b));

        }


    }
}
