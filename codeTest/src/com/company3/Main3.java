package com.company3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
