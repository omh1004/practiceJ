package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class mj_2753 {
    public static void main(String[] args) throws IOException {
        System.out.println("윤년구하기");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int yun = Integer.parseInt(br.readLine());

        br.close();

        System.out.println(yun%4 !=0 ? 0 : (yun % 100 != 0 || yun % 400 ==0) ? 1 :0);

    }
}
