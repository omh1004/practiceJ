package mj_1546;

import java.util.Arrays;
import java.util.Scanner;

public class mj_1546_1 {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    double[] num = new double[sc.nextInt()];

    for (int i = 0; i < num.length; i++) {

      num[i] = sc.nextDouble();
    }

    sc.close();

    double sum = 0 ;

    Arrays.sort(num);

    for (int i = 0; i < num.length; i++) {

      sum += ((num[i] / num[num.length-1]) * 100);


    }


    System.out.println(sum / num.length);

  }
}
