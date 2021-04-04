package com.step1;

import java.util.Scanner;

public class Test10 {
//    두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A  = scan.nextInt();
        int B  = scan.nextInt();
        int C  = scan.nextInt();

//        첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.


        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println((A%C) * (B%C) % C);
    }
}

//형변환 할때는 변수 앞에!!
// (형)변수

