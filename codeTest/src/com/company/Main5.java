package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
//10 45

        if (M - 45 < 0) {
            if (H == 0) {
                H = 23;
                M = Math.abs(M - 45 + 60);
            } else {
                H = H - 1;
                M = Math.abs(M - 45 + 60);
            }
        } else {
            H = H;
            M = Math.abs(M - 45);

        }
        System.out.print(H + " ");
        System.out.print(M + " ");


    }


}
//09 45
//        +45
//        10 30
//
//
//입력
//        첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//
//        입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//
//        출력
//        첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
//
//        예제 입력 1
//        10 10
//        예제 출력 1
//