package com.step1;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        double result = (double)a / (double)b;
        System.out.println(result);
    }
}

//형변환 할때는 변수 앞에!!
// (형)변수

