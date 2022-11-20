package mj_2562;

import java.util.Scanner;

public class mj_2562 {
  public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);

    int max = 0 ;
    int idx = 0;
    int N = in.nextInt();
    int num = 0;

    for(int i = 1 ; i <= N; i++) {
      num = in.nextInt();

      if(max < num) {
        max = num;
        idx = i ;
      }

    }

    in.close();

    System.out.print(max + "\n" + idx);

  }
}
