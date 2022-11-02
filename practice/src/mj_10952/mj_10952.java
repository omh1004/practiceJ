package com.company;

import java.util.Scanner;

public class mj_10952 {
    public static void main(String[] args) {


        //입력을 받을 Scanner 클래스 객체 생성
        Scanner sc = new Scanner(System.in);


        // 두수를 입력받아 더하고, 두수가 모두 0 이면 break문 빠져나옴
        while (true){

            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A == 0 && B ==0){
                sc.close();
                break;

            }

            System.out.println(A+B);

        }
    }
}
