package com.step2;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0){
            System.out.println("1");
        }
        if (x > 0 && y < 0){
            System.out.println("4");
        }
        if (x < 0 && y > 0){
            System.out.println("2");
        }
        if (x < 0 && y < 0){
            System.out.println("3");
        }



    }
}


//입력
//        첫 줄에는 정수 x가 주어진다.(−1000 ≤ x ≤ 1000;x ≠ 0)다음 줄에는 정수 y가 주어진다.(−1000 ≤ y ≤ 1000;y ≠ 0)
//
//        출력
//        점(x,y)의 사분면 번호(1,2,3,4중 하나)를 출력한다.
