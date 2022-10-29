package mj_14681;

import java.util.Scanner;

public class mj_14681_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    sc.close();

    int awn;

    awn =  (x >0 ? (y > 0 ?  1:  4 ): (y < 0  ?  2:  3));

    System.out.println(awn);
  }
}
