package mj_8958;

import java.util.Scanner;

public class mj_8959_re {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String arr[] = new String[in.nextInt()];


    // 배열인덱스마다 값을 받는다.
    for (int i = 0; i < arr.length; i++) {

      arr[i] = in.next();
    }

    // 입출력자원 닫음
    in.close();

    for (int i = 0; i < arr.length; i++) {
      int cnt = 0;
      int sum = 0;
      for (int j = 0; j < arr[i].length(); j++) {
        if(arr[i].charAt(j) == 'O') {
          cnt++;
        }else {
          cnt =0;
        }
        sum += cnt;
      }
      System.out.println(sum);
    }

  }
}
