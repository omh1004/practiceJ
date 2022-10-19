package practice;

import java.util.Arrays;
import java.util.Scanner;

public class mj_10818 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] num = new int[n];
    int temp = 0;


    for (int i = 0; i < n; i++) {

      num[i] = scan.nextInt();

    }

    scan.close();

    Arrays.sort(num);

    System.out.println(num[0] + " " + num[n - 1]);


  }

}
