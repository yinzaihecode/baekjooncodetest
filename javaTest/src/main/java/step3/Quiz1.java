package step3;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

//https://www.acmicpc.net/step/3
//https://www.acmicpc.net/problem/2739
//
//Scanner in = new Scanner(System.in);	// Scanner 객체 생성
//
//        byte a = in.nextByte(); 		// byte 형 입력 및 리턴
//        short b = in.nextShort(); 		// short 형 입력 및 리턴
//        int c = in.nextInt(); 			// int 형 입력 및 리턴
//        long d = in.nextLong(); 		// long 형 입력 및 리턴
//
//        float e = in.nextFloat(); 		// float 형 입력 및 리턴
//        double f = in.nextDouble(); 	// double 형 입력 및 리턴
//
//        boolean g = in.nextBoolean(); 	// boolean 형 입력 및 리턴
//
//        String h = in.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
//        String i = in.nextLine(); 		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)

//2 * 1 = 2

/*
* 제출시 클래스 이름은 Main이어어야 함.
* import문 작성해야함.
* */

public class Quiz1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=1; i<10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }

    }
}


//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int N = scan.nextInt();
//
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(N + " * " + i + " = " + N * i);
//        }
//    }
//}
