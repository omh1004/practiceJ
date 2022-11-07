package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {


       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       // StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        sc.close();
        char grade = 'F' ;


        if(st > 90){
            grade = 'A';
        }else if (st >= 80 && st < 90){
            grade = 'B';
        }else if (st >= 70 && st < 80){
            grade = 'C';
        }else if (st >=60 && st < 70){
            grade = 'D';
        }

        System.out.println(grade);

    }
}
